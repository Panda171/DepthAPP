package com.depth.app.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\'\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/depth/app/data/local/dao/DepthDao;", "", "getDepthsForLake", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/depth/app/data/local/entity/DepthPointEntity;", "lakeId", "", "(Ljava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", "insertDepth", "", "point", "(Lcom/depth/app/data/local/entity/DepthPointEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface DepthDao {
    
    @androidx.room.Query(value = "SELECT * FROM depth_points WHERE lakeId = :lakeId")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.depth.app.data.local.entity.DepthPointEntity>> getDepthsForLake(@org.jetbrains.annotations.Nullable()
    java.lang.Long lakeId);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertDepth(@org.jetbrains.annotations.NotNull()
    com.depth.app.data.local.entity.DepthPointEntity point, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}