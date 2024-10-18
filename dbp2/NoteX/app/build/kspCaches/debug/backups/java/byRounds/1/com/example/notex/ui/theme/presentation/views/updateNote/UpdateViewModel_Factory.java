package com.example.notex.ui.theme.presentation.views.updateNote;

import androidx.lifecycle.SavedStateHandle;
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
public final class UpdateViewModel_Factory implements Factory<UpdateViewModel> {
  private final Provider<NoteUseCase> useCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public UpdateViewModel_Factory(Provider<NoteUseCase> useCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.useCaseProvider = useCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public UpdateViewModel get() {
    return newInstance(useCaseProvider.get(), savedStateHandleProvider.get());
  }

  public static UpdateViewModel_Factory create(Provider<NoteUseCase> useCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new UpdateViewModel_Factory(useCaseProvider, savedStateHandleProvider);
  }

  public static UpdateViewModel newInstance(NoteUseCase useCase,
      SavedStateHandle savedStateHandle) {
    return new UpdateViewModel(useCase, savedStateHandle);
  }
}
