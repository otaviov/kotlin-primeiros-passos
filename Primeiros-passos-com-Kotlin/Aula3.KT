/**
 *              Operadores comporativos
 * 
 *  ° Os comandos compareTo retornam os valores -1
 *  (menor que), 0 (igual) ou 1(maior) . Já os operadores retornam 
 *  valores booleanos;
 * 
 *  ° O comando equals retorna um booleano;
 */


const val EQUAL = 0 
const val LESS = -1
const val MORE = 1
//função principal

/** fun main() {
​
    val d = 22
    val t = 90
    
    println(d > t)
    println(d.compareTo(t) == MORE)
}
*/

// equals 

fun  main () {
    ​
        val  d  =  90
        val  t  =  d
        
        println ( d  >  t )
        println ( ! d . equals ( t ))
    }