package com.example.notex.ui.theme.di;

import android.content.Context;
import com.example.notex.ui.theme.data.NoteDataBase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class NoteModule_ProvideDatabaseFactory implements Factory<NoteDataBase> {
  private final Provider<Context> contextProvider;

  public NoteModule_ProvideDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NoteDataBase get() {
    return provideDatabase(contextProvider.get());
  }

  public static NoteModule_ProvideDatabaseFactory create(Provider<Context> contextProvider) {
    return new NoteModule_ProvideDatabaseFactory(contextProvider);
  }

  public static NoteDataBase provideDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(NoteModule.INSTANCE.provideDatabase(context));
  }
}
