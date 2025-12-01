package com.depth.app.di;

import com.depth.app.data.local.dao.FishingSpotDao;
import com.depth.app.domain.repository.FishingRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideFishingRepositoryFactory implements Factory<FishingRepository> {
  private final Provider<FishingSpotDao> fishingSpotDaoProvider;

  public AppModule_ProvideFishingRepositoryFactory(
      Provider<FishingSpotDao> fishingSpotDaoProvider) {
    this.fishingSpotDaoProvider = fishingSpotDaoProvider;
  }

  @Override
  public FishingRepository get() {
    return provideFishingRepository(fishingSpotDaoProvider.get());
  }

  public static AppModule_ProvideFishingRepositoryFactory create(
      Provider<FishingSpotDao> fishingSpotDaoProvider) {
    return new AppModule_ProvideFishingRepositoryFactory(fishingSpotDaoProvider);
  }

  public static FishingRepository provideFishingRepository(FishingSpotDao fishingSpotDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideFishingRepository(fishingSpotDao));
  }
}
