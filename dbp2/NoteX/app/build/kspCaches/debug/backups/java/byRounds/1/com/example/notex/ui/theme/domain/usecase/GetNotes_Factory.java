package com.example.notex.ui.theme.domain.usecase;

import com.example.notex.ui.theme.data.ReposityImpl;
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
public final class GetNotes_Factory implements Factory<GetNotes> {
  private final Provider<ReposityImpl> reposityProvider;

  public GetNotes_Factory(Provider<ReposityImpl> reposityProvider) {
    this.reposityProvider = reposityProvider;
  }

  @Override
  public GetNotes get() {
    return newInstance(reposityProvider.get());
  }

  public static GetNotes_Factory create(Provider<ReposityImpl> reposityProvider) {
    return new GetNotes_Factory(reposityProvider);
  }

  public static GetNotes newInstance(ReposityImpl reposity) {
    return new GetNotes(reposity);
  }
}
