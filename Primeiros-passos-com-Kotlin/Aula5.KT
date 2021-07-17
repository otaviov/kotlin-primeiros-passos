/**
 *               Manipulação de Strings
 * 
 *  ° Strings possuem diversos métodos associados;
 *  ° indexação, concatenação, comparação, formação;
 *  ° Pode ser concatenada com plus/+;
 *  ° Também é tratada como um array de Char;
 *    
 *               Indexação
 * 
 *  ° String como array;
 *  ° First(), last(), String.length, String[index]
 * 
 *              val s = "Olá, mundo!"
 *              println(s[0])
 *              println(s.first())
 *              //imprime O
 *              println(s[s.length-1])
 *              println(s.last())
 *              //imprime
 * 
 *              Concatenação:
 * 
 * ° Para concatenar duas strings o plus/+ pode ser utilizado;
 * ° Para concatenar uma variável a uma String, os símbolos ${}
 *   devem ser inseridos;
 * 
 *              val name = "Ana"
 *              val s = "Olá"
 *              println(s + name)
 *              // imprime OláAna
 *              println("${s}", ${name}!")
 *              // imprime Olá, Ana!
 *              println("Bem vinda(o), $name!")
 *              // imprime Bem vinda(o), Ana!
 * 
 */

 // Exemplos 

 fun main() {
    val welcome = "Bem vinda(o)"
    var name = "otavio"
        println("$welcome, ${name.capitalize()}!")
    
}
 


