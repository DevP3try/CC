@file:JvmName("JDoodle")
// use (https://www.jdoodle.com/compile-kotlin-online) para executar o programa



fun main() {
    println("Calculadora da Lei de Ohm") // Imprimindo o titulo apenas uma vez ao executar o programa.
    while(true){ // Iniciando o Loop
        
        println("\nDigite o numero correspondente ao calculo")
        choseOptions() // chama a funcao que imprime as opcoes
        
        val getChoice: () -> Int? = { // função anonima (lambda) que imprime uma mensagem e requisita uma entrada, retornando um Int ou Null
            print("\nEscolha a opção: ")
            readLine()?.toIntOrNull()
        }
        //val choice = readLine()?.toIntOrNull() // variavel que requisita a entrada de um valor Int caso contrario, devolve valor Null
        
        when (getChoice()) { // verifica qual a entrada do usuario e chama a funcao correspondente 
            1 -> calcV()
            2 -> calcI()
            3 -> calcR()
            4 -> { // Finaliza o programa
                println("Programa desenvolvido por Anderson Kaua Oliveira Petry, RA R829952 encerrado")
                break
            }
            else -> println("\nOpcao invalida, por favor tente de novo.") // em caso de entrada inesperada 
            
        }
    }
}
// funcao para listar as opcoes do menu
fun choseOptions() {
    val options = listOf(
        "\n1 - Calcular Tensão (U)",
        "2 - Calcular Corrente (I)",
        "3 - Calcular Resistência (R)",
        "4 - Sair"
    )
    options.forEach { println(it) } // imprime cada item da lista options
    
}

fun getValue(valueMesage: String): Double? { // Exibe uma mensagem e retorna o valor digitado como Double, ou Null se for invalido.
    print(valueMesage)
    return readLine()?.toDoubleOrNull()
}


fun calcV() { // calcula tensao (U em volts) = corrente * resistencia

    // Entrada dos valores 
    val corrente = getValue("\nDigite o valor da Corrente (I em amperes) : ")
    val resistencia = getValue("\nDigite o valor da Resistência (R em ohms) : ")
    
    // Verificacao das entradas e calculo
    if (corrente != null && resistencia != null) {
        val tensao: Double = corrente * resistencia
        println("\nA tensão (U) é de: $tensao volts")
    } else {
        println("Entrada inválida. Tente novamente.")
    }
    
}

fun calcR() { // calcula a resistencia (R em ohms) = tensao / corrente
    
    // Entrada dos valores 
    val tensao = getValue("\nDigite o valor da Tensão (U em volts) : ")
    val corrente = getValue("\nDigite o valor da Corrente (I em amperes) : ")
    
    // Verificacao das entradas e calculo
    if (tensao != null && corrente != null && corrente != 0.0) {
        val resistencia: Double = tensao / corrente
        println("\nA Resistencia (R) é de: ${resistencia} ohms")
    } else {
        println("Entrada inválida. Tente novamente.")
    }
    
}

fun calcI() { // calcula corrente (I em amperes) = tensao / resistencia

   // Entrada dos valores 
    val tensao = getValue("\nDigite o valor da Tensão (U em volts) : ")
    val resistencia = getValue("\nDigite o valor da Resistência (R em ohms) : ")
    
    // Verificacao das entradas e calculo
    if (tensao != null && resistencia != null && resistencia != 0.0) {
        val corrente: Double = tensao / resistencia
        println("\nA Corrente (I) é de: ${corrente} amperes")
    } else {
        println("Entrada inválida. Tente novamente.")
    }
    
}
