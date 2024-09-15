package com.example.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        setContent {
            Laboratorio4Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyComplexLayout()
                }
            }
        }
    }
}

@Composable
fun MyComplexLayout(){
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ){
            Text(text = "Ejemplo1")
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ){
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Column(Modifier.fillMaxSize()) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .background(Color.Cyan),
                        contentAlignment = Alignment.Center
                    ){
                        Text(text = "Ejemplo1")
                    }
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    ){
                        Box(modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .background(Color.Red),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "Ejemplo1")
                        }
                        Box(modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .background(Color.Green),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "Ejemplo1")
                        }
                    }
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .background(Color.Magenta),
                        contentAlignment = Alignment.BottomCenter
                    ){
                        Text(text = "Ejemplo1")
                    }
                }
            }
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Column(Modifier.fillMaxSize()) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .background(Color.Magenta),
                        contentAlignment = Alignment.Center
                    ){
                        Text(text = "Ejemplo1")
                    }
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    ){
                        Box(modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .background(Color.Red),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "Ejemplo1")
                        }
                        Box(modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .background(Color.Green),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "Ejemplo1")
                        }
                    }
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .background(Color.Cyan),
                        contentAlignment = Alignment.BottomCenter
                    ){
                        Text(text = "Ejemplo1")
                    }
                }
            }
        }
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta),
            contentAlignment = Alignment.BottomCenter
        ){
            Text(text = "Ejemplo1")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratorio4Theme {
        MyComplexLayout()
    }
}