package com.example.notex.ui.theme.di;

import com.example.notex.ui.theme.data.NoteDataBase;
import com.example.notex.ui.theme.domain.repository.Repository;
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
public final class NoteModule_ProvideDaoFactory implements Factory<Repository> {
  private final Provider<NoteDataBase> daoProvider;

  public NoteModule_ProvideDaoFactory(Provider<NoteDataBase> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public Repository get() {
    return provideDao(daoProvider.get());
  }

  public static NoteModule_ProvideDaoFactory create(Provider<NoteDataBase> daoProvider) {
    return new NoteModule_ProvideDaoFactory(daoProvider);
  }

  public static Repository provideDao(NoteDataBase dao) {
    return Preconditions.checkNotNullFromProvides(NoteModule.INSTANCE.provideDao(dao));
  }
}
