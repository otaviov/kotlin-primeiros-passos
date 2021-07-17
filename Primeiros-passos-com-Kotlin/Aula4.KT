/**
 *        Operadores Lógicos
 * 
 * ° Quando utiliza-se o comando, 
 *  é recomendado colocar a expressão entre 
 *  parênteses;
 * 
 *        Operadores In e range 
 * 
 *  ° Se valor está presente em uma lista ou uma faixa
 *  (range) de valores; 
 * 
 *  ° Range cria um intervalo  de valores que inicia no 
 *  primeiro parâmetro e acaba no segundo. 
 * 
 */

 // exemplo bingo 

 /** fun main() {
    val bingo = listOf(8,6,34,2,13)
    var number = (1..43).random()
 
    println(number)
    println(number in bingo)
}
*/

// Exemplo doação de sangue

const val MIN_AGE = 16
const val MAX_AGE= 68
fun main() {
	var age = (10..100).random()
    println("Qual a idade da pessoa: " + age)
    println( age in MIN_AGE..MAX_AGE)
    println(age >= MIN_AGE && age <= MAX_AGE)
    
    
}