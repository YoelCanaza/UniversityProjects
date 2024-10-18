package com.example.notex.ui.theme.data;

import com.example.notex.ui.theme.domain.repository.Repository;
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
    "KotlinInternalInJava"
})
public final class ReposityImpl_Factory implements Factory<ReposityImpl> {
  private final Provider<Repository> daoProvider;

  public ReposityImpl_Factory(Provider<Repository> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public ReposityImpl get() {
    return newInstance(daoProvider.get());
  }

  public static ReposityImpl_Factory create(Provider<Repository> daoProvider) {
    return new ReposityImpl_Factory(daoProvider);
  }

  public static ReposityImpl newInstance(Repository dao) {
    return new ReposityImpl(dao);
  }
}
