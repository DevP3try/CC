//=====================================================
fun main() {
    mostraNaTela()
 }
 fun mostraNaTela(){
     val nome:String="Anderson"
     println("Meu nome é: $nome")
 }
 //=====================================================
 fun main() {
    mostraNaTela("Anderson")
 }
 fun mostraNaTela(nome:String){
     println("Meu nome é: $nome")
 }
 //=====================================================
 fun main() {
    mostranatela("Anderson")
    mostranatela("Olavo")
 }
 fun mostranatela(nome: String){
     println( "meu nome é: $nome")
 }
 //=====================================================
 fun main() {
     mostranatela("Anderson")    
     mostranatela("Olavo")    
     mostranatela() 
 } 
 
 fun mostranatela(nome: String="Ataulfo"){
     println( "meu nome é: $nome") 
 }
 //=====================================================
 fun main() {
   println(mostranatela("Anderson"))
    println(mostranatela("Olavo"))
    println(mostranatela())
 }
 fun mostranatela(nome: String="Ataulfo"):String{
     return "o nome é: $nome"
    
 }
 //=====================================================
 fun main() {
     var result = sum(1,2)
     println(resul)
     println("Total $resultado")
     resultado=soma()
     println("Total $resultado")
 }
 //=====================================================
 fun main(){
     println(soma())
     println(soma(1,2))
     println(soma(1,2,3))
     
 }
 
 fun soma(n1:Int=7, n2:Int=7) = n1 + n1
 fun soma(n1:Int=5, n2:Int=7, n3:Int=8) = n1 + n2 + n3
 //=====================================================
 fun main(){
     val mensagem = fun(nome:String) {
         println("Olá $nome!")
     }
     mensagem("Anderson")
 }
 //=====================================================
 fun main() {
     val toUpperCase: (String) -> String = { it.uppercase() }
     val text = " Meu nome é Anderson Kauã Oliveira Petry"
     val textUpperCase = toUpperCase(text)
     println(textUpperCase)
 }
 //=====================================================
 fun main() {
     //usa lambda para concatenar duas strings
     val concatenar: (String, String) -> String = { str1, str2 -> str1 + str2 }
     // resultado
     val resultado = concatenar("Olá, ", "Anderson!")
     println(resultado)
 }
 //=====================================================