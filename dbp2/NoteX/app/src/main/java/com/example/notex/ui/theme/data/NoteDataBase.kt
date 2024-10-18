package com.example.notex.ui.theme.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notex.ui.theme.domain.entity.Note
import com.example.notex.ui.theme.domain.repository.Repository

@Database(entities = [Note::class], exportSchema = false, version = 1)
abstract class NoteDataBase:RoomDatabase() {
    abstract fun noteDao(): Repository
}