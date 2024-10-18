package com.example.notex.ui.theme.presentation.views.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.notex.ui.theme.presentation.navigation.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController,viewModel: HomeViewModel= hiltViewModel()) {
    val notes=viewModel.notes.collectAsState(initial = emptyList())
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "NoteX", color=Color.White) },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFF252525)) // Fondo negro en la AppBar
            )
        }, floatingActionButton = { FloatingActionButton(onClick = {
            navController.navigate(Screens.AddScreen.route) },
            containerColor = Color(0xFF252525), // Fondo del botón negro
            contentColor = Color.White // Icono blanco
            ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "")
        }},
        containerColor = Color(0xFF252525) // Fondo negro en la pantalla
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(it)
                .background(Color(0xFF252525))
                ){
            items(notes.value){
                Box(modifier = Modifier
                    .padding(16.dp)
                    .border(1.dp, color = Color.LightGray) // Color de las notas
                    .background(Color.LightGray)
                ){
                    Column(modifier = Modifier.padding(20.dp)) {
                        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center) {
                            Text(text = "#${notes.value.indexOf(it)+1}")
                            Spacer(modifier = Modifier.weight(1f))
                            IconButton(onClick = {
                                navController.navigate(Screens.UpdateScreen.getById(it.id))
                            }) {
                                Icon(
                                    tint=Color.Black.copy(0.5f),
                                    imageVector = Icons.Default.Edit, contentDescription ="" )
                            }
                            IconButton(onClick = {
                                viewModel.deleteNote(note = it)
                            }) {

                                Icon(
                                    tint=Color.Black.copy(0.5f),
                                    imageVector = Icons.Default.Delete, contentDescription ="" )
                            }
                        }
                        Text(text =it.titulo, fontWeight = FontWeight.Bold, fontSize = 24.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = it.contenido)
                    }
                }
            }

        }
    }
}