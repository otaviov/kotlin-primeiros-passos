/**
 *              Empty X Blank 
 * 
 *  ° Métodos de comparação;
 *  ° String está vazia, em branco ou é nula? 
 * 
 *              val s = ""
 *              println(s.isEmpty())
 *              //true
 *              println(s.isBlank())
 *              //true
 *              println(sisNullOrBlank()) || 
 *              s. isNullOrEmpty())
 *              //true
 *              val s = "    "
 *              println(s.isEmpty())
 *              //false
 *              println(s.isBlank())
 *              //true
 * 
 *  ° Se o tamanho da string (s.length) for 0 está empty e Blank;
 *  ° Se o tamanho for > 0 mas todos os caracteres são espaços
 *    em branco, está Blank mas não empty;
 */

 //exemplos

 fun main() {
	val empty = ""
    println(empty.length)
    
    val blank = "        "
    println(blank.length)
    
    //println(empty.isEmpty() && empty.isBlank())
    println(blank.isEmpty() || blank.isBlank())
    
}