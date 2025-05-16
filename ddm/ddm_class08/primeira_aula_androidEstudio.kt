package com.example.aula8r829952anderson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aula8r829952anderson.ui.theme.Aula8R829952AndersonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aula8R829952AndersonTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable /* @COMPOSABLE DECLARA QUE A FUNCAO EH VISIVEL NA TELA */
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (modifier = modifier
        .background(Color.LightGray)
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Olá $name!",
            modifier = modifier
                .padding(16.dp)
                .fillMaxWidth()
                .background(Color.Green),
        )
        Text(
            text = "RA - R829952",
            modifier = modifier
                .background(Color.Cyan)
                .fillMaxWidth()
        )
        Text(
            text = "Barra de Botões",

        )

        Row(modifier = modifier
                .background(Color.Yellow)
                .fillMaxSize()
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Box(modifier = modifier
                .background(Color.Red)
            ){
                Column (modifier = modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Clique se Concorda")
                    Button(onClick = { /* TODO */ }) {
                        Text(text = "Botão 1")
                    }
                }

            }
            Box(modifier = modifier
                .background(Color.Blue),

            ){
                Column (modifier = modifier,
                        horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Clique se Discorda")
                    Button(onClick = { /* TODO */ }) {
                        Text(text = "Botão 2")
                    }
                }
                            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Aula8R829952AndersonTheme {
        Greeting("Anderson")
    }
}