package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlin.random.Random
import kotlin.time.Duration.Companion.seconds
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
    //capturando a as dimensoes da tela
    val larguraTela = LocalConfiguration.current.screenWidthDp.dp
    val alturaTela = LocalConfiguration.current.screenHeightDp.dp


    // definindo tamanho da caixa, possivel alteracoes para a dificuldade
    val tamanhoBox = 100.dp

    //dimensoes uteis do box para posicionar o quadrado interno
    val larguraUtil:Int=(larguraTela.value.toInt()-tamanhoBox.value.toInt())
    val alturaUtil:Int=(alturaTela.value.toInt()-tamanhoBox.value.toInt())

    //definindo posicao incial do quadrado
    var posicaoX:Dp by remember { mutableStateOf(120.dp) }
    var posicaoY:Dp by remember { mutableStateOf(120.dp) }

    //contador de toque
    var contaToque:Int by remember { mutableStateOf(0)}
    Column() {
        Text(
            text = "Placar $contaToque",
            modifier = modifier
        )
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)){
                Box(modifier = Modifier
                    .offset(x = posicaoX, y = posicaoY)
                    .size(tamanhoBox)
                    .background(Color.Blue)
                    //acao ao clicar no quadrado azul
                    .clickable {
                        posicaoX = Random.nextInt(0, larguraUtil).dp
                        posicaoY = Random.nextInt(0, alturaUtil).dp

                        contaToque++
                    }
                ){}
            }
    }



}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}