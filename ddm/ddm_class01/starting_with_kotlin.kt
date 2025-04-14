//=====================================================
fun main() {
    
    var nome="Anderson"
    var idade=19
    var altura=1.80
    var favFood="Strogonoff"
    
    
    println("Olá, $nome.")
    println("idade: "+idade)
    println("altura: $altura")
    println("Comida Favorita: "+favFood)
}
//=====================================================
fun main() {
    var n1:Double=1.0
    var n2:Double=2.0
    var resp=n1/n2
    println(resp)
}
//=====================================================
fun main() {
    val numbers: IntArray = intArrayOf(10, 20, 30, 40, 50)
    // Acessando e imprimindo numeros especificos dentro do array
    println("First number: ${numbers[0]}")
    println("Second number: ${numbers[1]}")
    
    //Alterando um elemento da array
    numbers[3] = 17
    println("Third Element has change an become: ${numbers[3]}")
    		
}
//=====================================================
fun main(){ 
	var fruits:MutableList<String> = mutableListOf("apple","pineapple","orange","strawberry", "Eggplant")
    println("${fruits[0]}")
    println("${fruits[1]}")
    fruits[0]= "Nothing"
    println("$fruits")
    fruits.add("Banana")
    println("$fruits")
    fruits.remove("Nothing")
    println("$fruits")
}
//=====================================================
fun main() {
    var people:Pair<String, Int> = Pair("Anderson", 19)
    
    //acessando os valorares pair
    val name = people.first
    val age = people.second
    
    println("Nome: $name, Idade: $age")
}
//=====================================================
