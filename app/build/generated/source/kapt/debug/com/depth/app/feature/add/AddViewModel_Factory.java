package com.depth.app.feature.add;

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
public final class AddViewModel_Factory implements Factory<AddViewModel> {
  private final Provider<FishingRepository> fishingRepositoryProvider;

  private final Provider<DepthRepository> depthRepositoryProvider;

  public AddViewModel_Factory(Provider<FishingRepository> fishingRepositoryProvider,
      Provider<DepthRepository> depthRepositoryProvider) {
    this.fishingRepositoryProvider = fishingRepositoryProvider;
    this.depthRepositoryProvider = depthRepositoryProvider;
  }

  @Override
  public AddViewModel get() {
    return newInstance(fishingRepositoryProvider.get(), depthRepositoryProvider.get());
  }

  public static AddViewModel_Factory create(Provider<FishingRepository> fishingRepositoryProvider,
      Provider<DepthRepository> depthRepositoryProvider) {
    return new AddViewModel_Factory(fishingRepositoryProvider, depthRepositoryProvider);
  }

  public static AddViewModel newInstance(FishingRepository fishingRepository,
      DepthRepository depthRepository) {
    return new AddViewModel(fishingRepository, depthRepository);
  }
}
