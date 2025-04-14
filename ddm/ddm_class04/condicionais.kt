//===============================================================================
fun main(){
    val idade = 25
    if(idade >=18){
        println("voce é maior de idade.")
    }else{
        println("voce é menor de idade.")
    }
}
//===============================================================================
fun main() {
    val estaChovendo = false
    
    if (estaChovendo) {
        println("Leve um Guarda-chuva!")
    } else {
        println("Aproveite o dia ensolarado!")
    }
}
//===============================================================================
fun main (){
    val idade = 25 
    val mensagem = if ( idade >= 18)"pode dirigir " else "não pode dirigir"
    println(mensagem)
}
//===============================================================================
fun main() {
    val verificarIdade = fun(idade: Int): String {
        return if (idade >= 18) "pode dirigir" else "não pode dirigir"
    }
    
    val idade = 19
    val mensagem = verificarIdade(idade)
    println(mensagem)
}
//===============================================================================
import kotlin.random.Random
fun main(){
    val numeroSorteados = Random.nextInt(-10, 10) 
    println ( " o numero sorteado foi:$numeroSorteados") 
    when {
        numeroSorteados > 0 -> println("numero positivo") 
        numeroSorteados < 0 -> println(" numero negativo") 
        else -> println ("Zero")
    }
}
//===============================================================================
import kotlin.random.Random
fun main(){
    val numeroSorteados = Random.nextInt(0, 7) 
    println ( " o numero sorteado foi:$numeroSorteados")
    when (numeroSorteados) {
    	1 -> println("Domingo")
        2 -> println("Terça-Feira")
        3 -> println("Quarta-Feira")
        4 -> println("Quinta-Feira")
        5 -> println("Sexta-Feira")
        6 -> println("Sabado")
        else -> println("Numero Invalido")}
    }
//===============================================================================
import kotlin.random.Random
 fun main(){
     val idade = Random.nextInt(0,100)
     println(" O numero sorteado foi: $idade")
     when (idade){
         in 0..12 -> println("criança")
          in 13..19 -> println("Adolescente")
           in 20..59 -> println("Adulto")
            else  -> println("Idoso")
     }
 }
//===============================================================================
import kotlin.random.Random
 fun main(){
     
     val numeroSorteado = Random.nextInt(1, 5)
     println("O numero sorteado foi: $numeroSorteado")
     val numeroPorExtenso = when (numeroSorteado) {
         1 -> "um"
         2-> "dois"
         3->"três"
         4->"quatro"
         else -> "numero invalido"
     }
     println("Por extenso: $numeroPorExtenso")
 }


//===============================================================================
import kotlin.random.Random
 fun main(){ 
     val limite = Random.nextInt(1, 10)
     println ( " o numero sorteado foi : $limite")
     for ( i in 1..limite){
         println(i)
         
     }
 }
 //===============================================================================
import kotlin.random.Random
 fun main(){
     val limite = Random.nextInt(1,10)
     println("o numero sorteado foi: $limite")
     for (i in 1..limite step 2){
         println(i)
     }
 }
//===============================================================================
 fun main(){
     var text= "joão victor santana e anderson"
     for (char in text){
     println ( char)     
     }
    
 }
//===============================================================================
fun main() {
    var frutas = listOf("maça", "banana", "laranja")
    for (item in frutas) {
        println(item)
    }
}
//===============================================================================
fun main(){
    var frutas = listOf("maça","banana", "laranja") 
    for ((indice , item) in frutas.withIndex()){
        println( "Indice: $indice, Item: $item")
    }
   
    
}
//===============================================================================
import kotlin.random.Random
fun main() {
    var contador = Random.nextInt(1,10)
    println("A contagem iniciará em : $contador")
    while (contador >= 0) {
        println(contador)
        contador--
    }
    println("Fogo!")
}
//===============================================================================
 import kotlin.random.Random
fun main() {
    var numero=3
    var chute:Int
    while (true){
        chute = Random.nextInt(1 ,10)
        println (" tentando $chute")
        if (chute==numero){
            break
        }
    }
    println ( " correto!")
}
//===============================================================================
 import kotlin.random.Random
fun main() {
    val numero=3
    var chute:Int
    do{
        chute = Random.nextInt(1,10)
        println("Tentando $chute")
    }while(chute!=numero)
    println("Correto!")
}
//===============================================================================