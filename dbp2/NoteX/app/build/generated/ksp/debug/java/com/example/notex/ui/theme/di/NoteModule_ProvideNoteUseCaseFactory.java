package com.example.notex.ui.theme.di;

import com.example.notex.ui.theme.data.ReposityImpl;
import com.example.notex.ui.theme.domain.usecase.NoteUseCase;
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
    "KotlinInternalInJava"
})
public final class NoteModule_ProvideNoteUseCaseFactory implements Factory<NoteUseCase> {
  private final Provider<ReposityImpl> repositoryProvider;

  public NoteModule_ProvideNoteUseCaseFactory(Provider<ReposityImpl> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public NoteUseCase get() {
    return provideNoteUseCase(repositoryProvider.get());
  }

  public static NoteModule_ProvideNoteUseCaseFactory create(
      Provider<ReposityImpl> repositoryProvider) {
    return new NoteModule_ProvideNoteUseCaseFactory(repositoryProvider);
  }

  public static NoteUseCase provideNoteUseCase(ReposityImpl repository) {
    return Preconditions.checkNotNullFromProvides(NoteModule.INSTANCE.provideNoteUseCase(repository));
  }
}
