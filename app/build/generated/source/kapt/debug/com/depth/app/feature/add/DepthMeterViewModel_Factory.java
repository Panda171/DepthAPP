package com.depth.app.feature.add;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class DepthMeterViewModel_Factory implements Factory<DepthMeterViewModel> {
  @Override
  public DepthMeterViewModel get() {
    return newInstance();
  }

  public static DepthMeterViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DepthMeterViewModel newInstance() {
    return new DepthMeterViewModel();
  }

  private static final class InstanceHolder {
    private static final DepthMeterViewModel_Factory INSTANCE = new DepthMeterViewModel_Factory();
  }
}
