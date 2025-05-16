package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
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



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var numero1 by remember { mutableStateOf("") }
    var numero2 by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }
    

    // Anderson Kaua Oliveira Petry - R829952


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        OutlinedTextField(
            value = numero1,
            onValueChange = { numero1 = it },
            label = { Text("Número 1") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = numero2,
            onValueChange = { numero2 = it },
            label = { Text("Número 2") },
            modifier = Modifier.fillMaxWidth()
        )
        Row() {
            Button(
                onClick = {
                    val num1 = numero1.toIntOrNull() ?: 0
                    val num2 = numero2.toIntOrNull() ?: 0
                    resultado = (num1 + num2).toString()
                },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text("+")
            }
            Button(
                onClick = {
                    val num1 = numero1.toIntOrNull() ?: 0
                    val num2 = numero2.toIntOrNull() ?: 0
                    resultado = (num1 - num2).toString()
                },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text("-")
            }
            Button(
                onClick = {
                    val num1 = numero1.toIntOrNull() ?: 0
                    val num2 = numero2.toIntOrNull() ?: 0
                    resultado = (num1 / num2).toString()
                },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text("/")
            }
            Button(
                onClick = {
                    val num1 = numero1.toIntOrNull() ?: 0
                    val num2 = numero2.toIntOrNull() ?: 0
                    resultado = (num1 * num2).toString()
                },
           