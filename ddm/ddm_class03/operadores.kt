//================================================
fun main() {
    val number1 = 10
    val number2 = 3
    println("sum: ${number1 + number2}")
    println("Sub: ${number1 - number2}")
    println("Multi: ${number1 * number2}")
    println("Div: ${number1 / number2}")
    println("Module: ${number1 % number2}")
}
//================================================
import kotlin.random.Random
fun main() {
    var n=Random.nextInt(0,15)
    println("numero $n")
    var n1= n % 2
    n/=2
    var n2= n % 2
    n/=2
    var n3=n% 2
    n/=2
    println("Binario $n $n3 $n2 $n1")
}
//================================================
fun main(){
    compara(2,3)
    compara(5,3)
    compara(3,3)
    
}

fun compara(n1:Int,n2:Int){
    val result: Boolean = n1>n2
    println("$n1 é maior que $n2 $result")
}
//================================================
fun main(){
    println("Tabela verdade do E (&&)")
    println("true and true :"+resultE(true,true))
    println("true and false:"+resultE(true,false))
    println("false and true:"+resultE(false,true))
    println("false and false:"+resultE(false,false))
}
fun resultE(b1:Boolean,b2:Boolean):Boolean{
    var result: Boolean = b1 && b2
    return(result)
    
}
//================================================
fun main(){
    println("Tabela verdade do OU (||)")
    println("true or true :"+resultE(true,true))
    println("true or false:"+resultE(true,false))
    println("false or true:"+resultE(false,true))
    println("false or false:"+resultE(false,false))
}
fun resultE(b1:Boolean,b2:Boolean):Boolean{
    var result: Boolean = b1 || b2
    return(result)
    
}
//================================================
fun searchName(id:Int): String? {
    return if (id == 1) "João" else null
}

fun main() {
    // Usando o operador elvis para chamar uma função como valor padrão
    var name = searchName(2) ?: "Você não é o João"
    println("Nome: $name")
    name=searchName(1) ?: "Você não é o João"
    println("Nome: $name")
}
//================================================
fun searchName(id:Int): String? {
    return if (id == 1) "João" else "Abrido"
}

fun main() {
    // Usando operador de seguranca para chamar um método
    var nameUpperCase = searchName(1)?.uppercase()
    println("Nome em maiúsculas: $nameUpperCase")
}
//================================================
fun searchName(id:Int): String? {
    return if (id == 1) "João" else null
}

fun main() {
    // Usando operador de seguranca para chamar um método
    var nameUpperCase = searchName(2)?.uppercase()?: "Nome não encontrado"
    println("Nome em maiúsculas: $nameUpperCase")
    nameUpperCase = searchName(1)?.uppercase()?: "Nome não encontrado"
    println("Nome em maiúsculas: $nameUpperCase")
}
//================================================