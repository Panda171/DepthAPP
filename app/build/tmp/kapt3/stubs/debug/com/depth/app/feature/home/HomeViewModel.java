package com.depth.app.feature.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020 H\u0002J\u0006\u0010#\u001a\u00020 R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018\u00a8\u0006$"}, d2 = {"Lcom/depth/app/feature/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "fishingRepository", "Lcom/depth/app/domain/repository/FishingRepository;", "depthRepository", "Lcom/depth/app/domain/repository/DepthRepository;", "(Lcom/depth/app/domain/repository/FishingRepository;Lcom/depth/app/domain/repository/DepthRepository;)V", "_depthLayerState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/depth/app/domain/model/DepthLayerState;", "_depthPoints", "", "Lcom/depth/app/domain/model/DepthPointWithAccess;", "_spots", "Lcom/depth/app/domain/model/FishingSpot;", "_stories", "Lcom/depth/app/domain/model/Story;", "currentLakeId", "", "Ljava/lang/Long;", "currentUserId", "depthLayerState", "Lkotlinx/coroutines/flow/StateFlow;", "getDepthLayerState", "()Lkotlinx/coroutines/flow/StateFlow;", "depthPoints", "getDepthPoints", "spots", "getSpots", "stories", "getStories", "observeDepths", "", "observeSpots", "observeStories", "unlockDepths", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.depth.app.domain.repository.FishingRepository fishingRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.depth.app.domain.repository.DepthRepository depthRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.depth.app.domain.model.Story>> _stories = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.depth.app.domain.model.Story>> stories = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.depth.app.domain.model.FishingSpot>> _spots = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.depth.app.domain.model.FishingSpot>> spots = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.depth.app.domain.model.DepthLayerState> _depthLayerState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.depth.app.domain.model.DepthLayerState> depthLayerState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.depth.app.domain.model.DepthPointWithAccess>> _depthPoints = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.depth.app.domain.model.DepthPointWithAccess>> depthPoints = null;
    private final long currentUserId = 1L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long currentLakeId = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.depth.app.domain.repository.FishingRepository fishingRepository, @org.jetbrains.annotations.NotNull()
    com.depth.app.domain.repository.DepthRepository depthRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.depth.app.domain.model.Story>> getStories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.depth.app.domain.model.FishingSpot>> getSpots() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.depth.app.domain.model.DepthLayerState> getDepthLayerState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.depth.app.domain.model.DepthPointWithAccess>> getDepthPoints() {
        return null;
    }
    
    private final void observeStories() {
    }
    
    private final void observeSpots() {
    }
    
    private final void observeDepths() {
    }
    
    public final void unlockDepths() {
    }
}