package com.example.notex.ui.theme.domain.usecase

import com.example.notex.ui.theme.data.ReposityImpl
import javax.inject.Inject

class GetByIdNote @Inject constructor(private val reposityImpl: ReposityImpl) {
    suspend operator fun invoke(id:Int)=reposityImpl.getByIdNote(id)
}