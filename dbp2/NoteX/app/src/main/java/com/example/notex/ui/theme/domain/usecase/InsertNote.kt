package com.example.notex.ui.theme.domain.usecase

import com.example.notex.ui.theme.data.ReposityImpl
import com.example.notex.ui.theme.domain.entity.Note

class InsertNote constructor(private val reposity: ReposityImpl) {
    suspend operator fun invoke(note: Note)=reposity.insertNote(note)
}