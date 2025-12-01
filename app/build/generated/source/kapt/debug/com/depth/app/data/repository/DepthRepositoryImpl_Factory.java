package com.depth.app.data.repository;

import com.depth.app.data.local.dao.DepthDao;
import com.depth.app.data.local.dao.SubscriptionDao;
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
public final class DepthRepositoryImpl_Factory implements Factory<DepthRepositoryImpl> {
  private final Provider<DepthDao> depthDaoProvider;

  private final Provider<SubscriptionDao> subscriptionDaoProvider;

  public DepthRepositoryImpl_Factory(Provider<DepthDao> depthDaoProvider,
      Provider<SubscriptionDao> subscriptionDaoProvider) {
    this.depthDaoProvider = depthDaoProvider;
    this.subscriptionDaoProvider = subscriptionDaoProvider;
  }

  @Override
  public DepthRepositoryImpl get() {
    return newInstance(depthDaoProvider.get(), subscriptionDaoProvider.get());
  }

  public static DepthRepositoryImpl_Factory create(Provider<DepthDao> depthDaoProvider,
      Provider<SubscriptionDao> subscriptionDaoProvider) {
    return new DepthRepositoryImpl_Factory(depthDaoProvider, subscriptionDaoProvider);
  }

  public static DepthRepositoryImpl newInstance(DepthDao depthDao,
      SubscriptionDao subscriptionDao) {
    return new DepthRepositoryImpl(depthDao, subscriptionDao);
  }
}
