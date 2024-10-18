package com.example.notex.ui.theme.domain.usecase

import com.example.notex.ui.theme.data.ReposityImpl
import javax.inject.Inject

class GetNotes @Inject constructor(private val reposity: ReposityImpl) {
    operator fun invoke()=reposity.getNotes()
}