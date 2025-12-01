package com.depth.app.data.repository;

import com.depth.app.data.local.dao.FishingSpotDao;
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
public final class FishingRepositoryImpl_Factory implements Factory<FishingRepositoryImpl> {
  private final Provider<FishingSpotDao> fishingSpotDaoProvider;

  public FishingRepositoryImpl_Factory(Provider<FishingSpotDao> fishingSpotDaoProvider) {
    this.fishingSpotDaoProvider = fishingSpotDaoProvider;
  }

  @Override
  public FishingRepositoryImpl get() {
    return newInstance(fishingSpotDaoProvider.get());
  }

  public static FishingRepositoryImpl_Factory create(
      Provider<FishingSpotDao> fishingSpotDaoProvider) {
    return new FishingRepositoryImpl_Factory(fishingSpotDaoProvider);
  }

  public static FishingRepositoryImpl newInstance(FishingSpotDao fishingSpotDao) {
    return new FishingRepositoryImpl(fishingSpotDao);
  }
}
