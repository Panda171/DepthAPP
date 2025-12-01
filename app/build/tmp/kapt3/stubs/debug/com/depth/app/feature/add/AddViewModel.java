package com.depth.app.feature.add;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/depth/app/feature/add/AddViewModel;", "Landroidx/lifecycle/ViewModel;", "fishingRepository", "Lcom/depth/app/domain/repository/FishingRepository;", "depthRepository", "Lcom/depth/app/domain/repository/DepthRepository;", "(Lcom/depth/app/domain/repository/FishingRepository;Lcom/depth/app/domain/repository/DepthRepository;)V", "saveCatchSpot", "", "spot", "Lcom/depth/app/domain/model/FishingSpot;", "saveDepthPoint", "point", "Lcom/depth/app/domain/model/DepthPoint;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class AddViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.depth.app.domain.repository.FishingRepository fishingRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.depth.app.domain.repository.DepthRepository depthRepository = null;
    
    @javax.inject.Inject()
    public AddViewModel(@org.jetbrains.annotations.NotNull()
    com.depth.app.domain.repository.FishingRepository fishingRepository, @org.jetbrains.annotations.NotNull()
    com.depth.app.domain.repository.DepthRepository depthRepository) {
        super();
    }
    
    public final void saveCatchSpot(@org.jetbrains.annotations.NotNull()
    com.depth.app.domain.model.FishingSpot spot) {
    }
    
    public final void saveDepthPoint(@org.jetbrains.annotations.NotNull()
    com.depth.app.domain.model.DepthPoint point) {
    }
}