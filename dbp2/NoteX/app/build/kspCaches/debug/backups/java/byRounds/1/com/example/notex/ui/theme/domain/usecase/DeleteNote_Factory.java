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
public final class DeleteNote_Factory implements Factory<DeleteNote> {
  private final Provider<ReposityImpl> repositoryProvider;

  public DeleteNote_Factory(Provider<ReposityImpl> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DeleteNote get() {
    return newInstance(repositoryProvider.get());
  }

  public static DeleteNote_Factory create(Provider<ReposityImpl> repositoryProvider) {
    return new DeleteNote_Factory(repositoryProvider);
  }

  public static DeleteNote newInstance(ReposityImpl repository) {
    return new DeleteNote(repository);
  }
}
