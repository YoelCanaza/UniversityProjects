package com.example.notex.ui.theme.presentation.views.homeScreen;

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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<NoteUseCase> useCaseProvider;

  public HomeViewModel_Factory(Provider<NoteUseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(useCaseProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<NoteUseCase> useCaseProvider) {
    return new HomeViewModel_Factory(useCaseProvider);
  }

  public static HomeViewModel newInstance(NoteUseCase useCase) {
    return new HomeViewModel(useCase);
  }
}
