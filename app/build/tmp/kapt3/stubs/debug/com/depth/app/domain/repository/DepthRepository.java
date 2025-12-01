package com.depth.app.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fH&\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/depth/app/domain/repository/DepthRepository;", "", "addDepthPoint", "", "point", "Lcom/depth/app/domain/model/DepthPoint;", "(Lcom/depth/app/domain/model/DepthPoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDepthsForLakeWithAccess", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/depth/app/domain/model/DepthPointWithAccess;", "lakeId", "", "currentUserId", "(Ljava/lang/Long;J)Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public abstract interface DepthRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.depth.app.domain.model.DepthPointWithAccess>> getDepthsForLakeWithAccess(@org.jetbrains.annotations.Nullable()
    java.lang.Long lakeId, long currentUserId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addDepthPoint(@org.jetbrains.annotations.NotNull()
    com.depth.app.domain.model.DepthPoint point, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}