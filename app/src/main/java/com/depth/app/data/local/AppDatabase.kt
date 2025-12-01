package com.depth.app.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.depth.app.data.local.dao.DepthDao
import com.depth.app.data.local.dao.FishingSpotDao
import com.depth.app.data.local.dao.SubscriptionDao
import com.depth.app.data.local.entity.DepthPointEntity
import com.depth.app.data.local.entity.FishingSpotEntity
import com.depth.app.data.local.entity.SubscriptionEntity

@Database(
    entities = [FishingSpotEntity::class, DepthPointEntity::class, SubscriptionEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun fishingSpotDao(): FishingSpotDao
    abstract fun depthDao(): DepthDao
    abstract fun subscriptionDao(): SubscriptionDao
}
