package com.example.notex.ui.theme.presentation.views.AddNote;

import com.example.notex.ui.theme.domain.usecase.NoteUseCase;
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
public final class AddViewModel_Factory implements Factory<AddViewModel> {
  private final Provider<NoteUseCase> useCaseProvider;

  public AddViewModel_Factory(Provider<NoteUseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public AddViewModel get() {
    return newInstance(useCaseProvider.get());
  }

  public static AddViewModel_Factory create(Provider<NoteUseCase> useCaseProvider) {
    return new AddViewModel_Factory(useCaseProvider);
  }

  public static AddViewModel newInstance(NoteUseCase useCase) {
    return new AddViewModel(useCase);
  }
}
