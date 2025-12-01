package com.depth.app.di;

import com.depth.app.data.local.dao.DepthDao;
import com.depth.app.data.local.dao.SubscriptionDao;
import com.depth.app.domain.repository.DepthRepository;
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
public final class AppModule_ProvideDepthRepositoryFactory implements Factory<DepthRepository> {
  private final Provider<DepthDao> depthDaoProvider;

  private final Provider<SubscriptionDao> subscriptionDaoProvider;

  public AppModule_ProvideDepthRepositoryFactory(Provider<DepthDao> depthDaoProvider,
      Provider<SubscriptionDao> subscriptionDaoProvider) {
    this.depthDaoProvider = depthDaoProvider;
    this.subscriptionDaoProvider = subscriptionDaoProvider;
  }

  @Override
  public DepthRepository get() {
    return provideDepthRepository(depthDaoProvider.get(), subscriptionDaoProvider.get());
  }

  public static AppModule_ProvideDepthRepositoryFactory create(Provider<DepthDao> depthDaoProvider,
      Provider<SubscriptionDao> subscriptionDaoProvider) {
    return new AppModule_ProvideDepthRepositoryFactory(depthDaoProvider, subscriptionDaoProvider);
  }

  public static DepthRepository provideDepthRepository(DepthDao depthDao,
      SubscriptionDao subscriptionDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDepthRepository(depthDao, subscriptionDao));
  }
}
