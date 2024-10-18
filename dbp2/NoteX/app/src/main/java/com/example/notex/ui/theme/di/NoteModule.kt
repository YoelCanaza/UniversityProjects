package com.example.notex.ui.theme.di

import android.content.Context
import androidx.room.Room
import com.example.notex.ui.theme.data.NoteDataBase
import com.example.notex.ui.theme.data.ReposityImpl
import com.example.notex.ui.theme.domain.entity.Note
import com.example.notex.ui.theme.domain.usecase.DeleteNote
import com.example.notex.ui.theme.domain.usecase.GetByIdNote
import com.example.notex.ui.theme.domain.usecase.GetNotes
import com.example.notex.ui.theme.domain.usecase.InsertNote
import com.example.notex.ui.theme.domain.usecase.NoteUseCase
import com.example.notex.ui.theme.domain.usecase.UpdateNote
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NoteModule {
    @Provides
    fun provideDatabase(@ApplicationContext context: Context):NoteDataBase= Room.databaseBuilder(
        context=context,
        klass = NoteDataBase::class.java,
        name = "NoteDB"
    ).build()

    @Provides
    fun provideDao(dao:NoteDataBase)=dao.noteDao()

    @Provides
    fun provideNoteUseCase(repository: ReposityImpl)= NoteUseCase(
        getNotes = GetNotes(repository),
        getByIdNote = GetByIdNote(repository),
        deleteNote = DeleteNote(repository),
        updateNote = UpdateNote(repository),
        insertNote = InsertNote(repository)
    )
}