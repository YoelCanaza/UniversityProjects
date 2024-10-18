package com.example.notex.ui.theme.presentation.views.AddNote

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.notex.ui.theme.domain.entity.Note
import com.example.notex.ui.theme.domain.usecase.NoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddViewModel @Inject constructor(private val useCase: NoteUseCase):ViewModel() {

    var titulo by mutableStateOf("")
    var contenido by mutableStateOf("")

    fun addNote()=viewModelScope.launch {
        useCase.insertNote(Note(titulo = titulo, contenido = contenido))
    }
}