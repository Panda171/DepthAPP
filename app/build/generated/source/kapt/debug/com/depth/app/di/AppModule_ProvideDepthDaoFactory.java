package com.depth.app.di;

import com.depth.app.data.local.AppDatabase;
import com.depth.app.data.local.dao.DepthDao;
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
public final class AppModule_ProvideDepthDaoFactory implements Factory<DepthDao> {
  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideDepthDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public DepthDao get() {
    return provideDepthDao(dbProvider.get());
  }

  public static AppModule_ProvideDepthDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideDepthDaoFactory(dbProvider);
  }

  public static DepthDao provideDepthDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDepthDao(db));
  }
}
