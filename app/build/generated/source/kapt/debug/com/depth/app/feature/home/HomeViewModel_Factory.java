package com.depth.app.feature.home;

import com.depth.app.domain.repository.DepthRepository;
import com.depth.app.domain.repository.FishingRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<FishingRepository> fishingRepositoryProvider;

  private final Provider<DepthRepository> depthRepositoryProvider;

  public HomeViewModel_Factory(Provider<FishingRepository> fishingRepositoryProvider,
      Provider<DepthRepository> depthRepositoryProvider) {
    this.fishingRepositoryProvider = fishingRepositoryProvider;
    this.depthRepositoryProvider = depthRepositoryProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(fishingRepositoryProvider.get(), depthRepositoryProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<FishingRepository> fishingRepositoryProvider,
      Provider<DepthRepository> depthRepositoryProvider) {
    return new HomeViewModel_Factory(fishingRepositoryProvider, depthRepositoryProvider);
  }

  public static HomeViewModel newInstance(FishingRepository fishingRepository,
      DepthRepository depthRepository) {
    return new HomeViewModel(fishingRepository, depthRepository);
  }
}
