package com.depth.app.di

import android.content.Context
import androidx.room.Room
import com.depth.app.data.local.AppDatabase
import com.depth.app.data.local.dao.DepthDao
import com.depth.app.data.local.dao.FishingSpotDao
import com.depth.app.data.local.dao.SubscriptionDao
import com.depth.app.data.repository.DepthRepositoryImpl
import com.depth.app.data.repository.FishingRepositoryImpl
import com.depth.app.domain.repository.DepthRepository
import com.depth.app.domain.repository.FishingRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "depth_db"
        ).build()
    }

    @Provides
    fun provideFishingSpotDao(db: AppDatabase): FishingSpotDao = db.fishingSpotDao()

    @Provides
    fun provideDepthDao(db: AppDatabase): DepthDao = db.depthDao()

    @Provides
    fun provideSubscriptionDao(db: AppDatabase): SubscriptionDao = db.subscriptionDao()

    @Provides
    @Singleton
    fun provideFishingRepository(
        fishingSpotDao: FishingSpotDao
    ): FishingRepository = FishingRepositoryImpl(fishingSpotDao)

    @Provides
    @Singleton
    fun provideDepthRepository(
        depthDao: DepthDao,
        subscriptionDao: SubscriptionDao
    ): DepthRepository = DepthRepositoryImpl(depthDao, subscriptionDao)
}
