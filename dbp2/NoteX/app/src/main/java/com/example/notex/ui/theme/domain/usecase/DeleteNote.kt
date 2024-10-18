package com.example.notex.ui.theme.domain.usecase

import com.example.notex.ui.theme.data.ReposityImpl
import com.example.notex.ui.theme.domain.entity.Note
import javax.inject.Inject

class DeleteNote  @Inject constructor(private val repository: ReposityImpl) {
    suspend operator fun invoke(note: Note)=repository.deleteNote(note)
}