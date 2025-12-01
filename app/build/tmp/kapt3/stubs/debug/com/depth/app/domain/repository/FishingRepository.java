package com.depth.app.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\bH&\u00a8\u0006\f"}, d2 = {"Lcom/depth/app/domain/repository/FishingRepository;", "", "addFishingSpot", "", "spot", "Lcom/depth/app/domain/model/FishingSpot;", "(Lcom/depth/app/domain/model/FishingSpot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFishingSpots", "Lkotlinx/coroutines/flow/Flow;", "", "getStories", "Lcom/depth/app/domain/model/Story;", "app_debug"})
public abstract interface FishingRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.depth.app.domain.model.FishingSpot>> getFishingSpots();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addFishingSpot(@org.jetbrains.annotations.NotNull()
    com.depth.app.domain.model.FishingSpot spot, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.depth.app.domain.model.Story>> getStories();
}