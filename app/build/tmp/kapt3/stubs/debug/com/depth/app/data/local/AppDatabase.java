package com.depth.app.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/depth/app/data/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "depthDao", "Lcom/depth/app/data/local/dao/DepthDao;", "fishingSpotDao", "Lcom/depth/app/data/local/dao/FishingSpotDao;", "subscriptionDao", "Lcom/depth/app/data/local/dao/SubscriptionDao;", "app_debug"})
@androidx.room.Database(entities = {com.depth.app.data.local.entity.FishingSpotEntity.class, com.depth.app.data.local.entity.DepthPointEntity.class, com.depth.app.data.local.entity.SubscriptionEntity.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.depth.app.data.local.dao.FishingSpotDao fishingSpotDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.depth.app.data.local.dao.DepthDao depthDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.depth.app.data.local.dao.SubscriptionDao subscriptionDao();
}