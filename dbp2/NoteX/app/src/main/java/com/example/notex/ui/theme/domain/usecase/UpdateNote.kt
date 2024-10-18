package com.example.notex.ui.theme.domain.usecase

import com.example.notex.ui.theme.data.ReposityImpl
import com.example.notex.ui.theme.domain.entity.Note
import javax.inject.Inject

class UpdateNote @Inject constructor(private val reposityImpl: ReposityImpl) {
    suspend operator fun invoke(note: Note)=reposityImpl.updateNote(note)
}