fun main() {
    while(true){ //Laco infinito ateh ser ativado o break
        println("Calculadora")
        println("Escolha o calculo:")
        println("1. soma")
        println("2. subtracao")
        println("3. Multiplicacao")
        println("4. Divisao")
        println("5. Modulo")
        println("6. sair")
        var option = readLine()?.toIntOrNull() 
        when (option) { 
            1->calcSum()
            2->calcSub()
            3->calcMult()
            4->calcDiv()
            5->calcMod()
            6->break
            else->println("Opcao invalida")
        }
    }
    println("Programa encerrado")
}

fun calcSum() {
    print("Digite o primeiro numero: ")
    val n1 = readLine()?.toDoubleOrNull()
    
    print("Digite o segundo numero: ")
    val n2 = readLine()?.toDoubleOrNull()
    
    if (n1 != null && n2 != null) {
        val result=n1+n2
        println("$n1 + $n2 = $result")
    } else {
        println("Entrada Invalida.")
    }
}
fun calcSub() {
    print("Digite o primeiro numero: ")
    val n1 = readLine()?.toDoubleOrNull()
    
    print("Digite o segundo numero: ")
    val n2 = readLine()?.toDoubleOrNull()
    
    if (n1 != null && n2 != null) {
        val result=n1-n2
        println("$n1 - $n2 = $result")
    } else {
        println("Entrada Invalida.")
    }
}

fun calcMult() {
    print("Digite o primeiro numero: ")
    val n1 = readLine()?.toDoubleOrNull()
    
    print("Digite o segundo numero: ")
    val n2 = readLine()?.toDoubleOrNull()
    
    if (n1 != null && n2 != null) {
        val result=n1*n2
        println("$n1 * $n2 = $result")
    } else {
        println("Entrada Invalida.")
    }
}
fun calcDiv() {
    print("Digite o primeiro numero: ")
    val n1 = readLine()?.toDoubleOrNull()
    
    print("Digite o segundo numero: ")
    val n2 = readLine()?.toDoubleOrNull()
    
    if (n1 != null && n2 != null) {
        val result=n1/n2
        println("$n1 / $n2 = $result")
    } else {
        println("Entrada Invalida.")
    }
}
fun calcMod() {
    print("Digite o primeiro numero: ")
    val n1 = readLine()?.toDoubleOrNull()
    
    print("Digite o segundo numero: ")
    val n2 = readLine()?.toDoubleOrNull()
    
    if (n1 != null && n2 != null) {
        val result=n1%n2
        println("$n1 % $n2 = $result")
    } else {
        println("Entrada Invalida.")
    }
}