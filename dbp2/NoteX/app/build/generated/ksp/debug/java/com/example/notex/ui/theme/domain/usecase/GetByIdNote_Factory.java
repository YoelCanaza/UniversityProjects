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
public final class GetByIdNote_Factory implements Factory<GetByIdNote> {
  private final Provider<ReposityImpl> reposityImplProvider;

  public GetByIdNote_Factory(Provider<ReposityImpl> reposityImplProvider) {
    this.reposityImplProvider = reposityImplProvider;
  }

  @Override
  public GetByIdNote get() {
    return newInstance(reposityImplProvider.get());
  }

  public static GetByIdNote_Factory create(Provider<ReposityImpl> reposityImplProvider) {
    return new GetByIdNote_Factory(reposityImplProvider);
  }

  public static GetByIdNote newInstance(ReposityImpl reposityImpl) {
    return new GetByIdNote(reposityImpl);
  }
}
