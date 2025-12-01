package com.depth.app.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/depth/app/di/AppModule;", "", "()V", "provideDatabase", "Lcom/depth/app/data/local/AppDatabase;", "context", "Landroid/content/Context;", "provideDepthDao", "Lcom/depth/app/data/local/dao/DepthDao;", "db", "provideDepthRepository", "Lcom/depth/app/domain/repository/DepthRepository;", "depthDao", "subscriptionDao", "Lcom/depth/app/data/local/dao/SubscriptionDao;", "provideFishingRepository", "Lcom/depth/app/domain/repository/FishingRepository;", "fishingSpotDao", "Lcom/depth/app/data/local/dao/FishingSpotDao;", "provideFishingSpotDao", "provideSubscriptionDao", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.depth.app.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.depth.app.data.local.AppDatabase provideDatabase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.depth.app.data.local.dao.FishingSpotDao provideFishingSpotDao(@org.jetbrains.annotations.NotNull()
    com.depth.app.data.local.AppDatabase db) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.depth.app.data.local.dao.DepthDao provideDepthDao(@org.jetbrains.annotations.NotNull()
    com.depth.app.data.local.AppDatabase db) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.depth.app.data.local.dao.SubscriptionDao provideSubscriptionDao(@org.jetbrains.annotations.NotNull()
    com.depth.app.data.local.AppDatabase db) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.depth.app.domain.repository.FishingRepository provideFishingRepository(@org.jetbrains.annotations.NotNull()
    com.depth.app.data.local.dao.FishingSpotDao fishingSpotDao) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.depth.app.domain.repository.DepthRepository provideDepthRepository(@org.jetbrains.annotations.NotNull()
    com.depth.app.data.local.dao.DepthDao depthDao, @org.jetbrains.annotations.NotNull()
    com.depth.app.data.local.dao.SubscriptionDao subscriptionDao) {
        return null;
    }
}