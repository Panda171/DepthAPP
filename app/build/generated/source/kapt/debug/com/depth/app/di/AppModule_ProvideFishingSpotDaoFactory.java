package com.depth.app.di;

import com.depth.app.data.local.AppDatabase;
import com.depth.app.data.local.dao.FishingSpotDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideFishingSpotDaoFactory implements Factory<FishingSpotDao> {
  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideFishingSpotDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public FishingSpotDao get() {
    return provideFishingSpotDao(dbProvider.get());
  }

  public static AppModule_ProvideFishingSpotDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideFishingSpotDaoFactory(dbProvider);
  }

  public static FishingSpotDao provideFishingSpotDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideFishingSpotDao(db));
  }
}
