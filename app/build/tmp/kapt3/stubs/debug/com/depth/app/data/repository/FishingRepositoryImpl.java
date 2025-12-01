package com.depth.app.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\f0\u000bH\u0016J\f\u0010\u000f\u001a\u00020\b*\u00020\u0010H\u0002J\f\u0010\u0011\u001a\u00020\u0010*\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/depth/app/data/repository/FishingRepositoryImpl;", "Lcom/depth/app/domain/repository/FishingRepository;", "fishingSpotDao", "Lcom/depth/app/data/local/dao/FishingSpotDao;", "(Lcom/depth/app/data/local/dao/FishingSpotDao;)V", "addFishingSpot", "", "spot", "Lcom/depth/app/domain/model/FishingSpot;", "(Lcom/depth/app/domain/model/FishingSpot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFishingSpots", "Lkotlinx/coroutines/flow/Flow;", "", "getStories", "Lcom/depth/app/domain/model/Story;", "toDomain", "Lcom/depth/app/data/local/entity/FishingSpotEntity;", "toEntity", "app_debug"})
public final class FishingRepositoryImpl implements com.depth.app.domain.repository.FishingRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.depth.app.data.local.dao.FishingSpotDao fishingSpotDao = null;
    
    @javax.inject.Inject()
    public FishingRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.depth.app.data.local.dao.FishingSpotDao fishingSpotDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.depth.app.domain.model.FishingSpot>> getFishingSpots() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addFishingSpot(@org.jetbrains.annotations.NotNull()
    com.depth.app.domain.model.FishingSpot spot, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.depth.app.domain.model.Story>> getStories() {
        return null;
    }
    
    private final com.depth.app.domain.model.FishingSpot toDomain(com.depth.app.data.local.entity.FishingSpotEntity $this$toDomain) {
        return null;
    }
    
    private final com.depth.app.data.local.entity.FishingSpotEntity toEntity(com.depth.app.domain.model.FishingSpot $this$toEntity) {
        return null;
    }
}