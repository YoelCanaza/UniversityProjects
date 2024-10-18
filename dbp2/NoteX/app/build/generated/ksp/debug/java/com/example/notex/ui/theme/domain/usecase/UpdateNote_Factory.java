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
public final class UpdateNote_Factory implements Factory<UpdateNote> {
  private final Provider<ReposityImpl> reposityImplProvider;

  public UpdateNote_Factory(Provider<ReposityImpl> reposityImplProvider) {
    this.reposityImplProvider = reposityImplProvider;
  }

  @Override
  public UpdateNote get() {
    return newInstance(reposityImplProvider.get());
  }

  public static UpdateNote_Factory create(Provider<ReposityImpl> reposityImplProvider) {
    return new UpdateNote_Factory(reposityImplProvider);
  }

  public static UpdateNote newInstance(ReposityImpl reposityImpl) {
    return new UpdateNote(reposityImpl);
  }
}
