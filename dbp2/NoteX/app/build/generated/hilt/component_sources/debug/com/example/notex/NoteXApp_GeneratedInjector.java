package com.example.notex;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = NoteXApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface NoteXApp_GeneratedInjector {
  void injectNoteXApp(NoteXApp noteXApp);
}
