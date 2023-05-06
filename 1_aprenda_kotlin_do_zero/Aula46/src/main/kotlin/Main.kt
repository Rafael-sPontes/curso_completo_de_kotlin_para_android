/*MODIFICADORES DE ACESSO
* private -> Visível apenas dentro da classe
* protected -> Funciona como o "Private", mas é visível em subclasses
* public -> Visível em todo lugar, caso não seja definido é o padrão
* internal -> Lembra o "public", mas sua visibilidade é restringida ao módulo,
* sendo então visível dentro de um mesmo módulo*/

fun main() {

    /*val animal = Animal()
    println(animal.nome)*/

    val cao = Cao()
    cao.exibeNome()
}

open class Animal {

    //private, protected, public
    //private
    //protected
    protected var nome = "Marley"

    //private
    fun dormir() {
        println("Dormir")
    }
}

class Cao: Animal() {
    fun exibeNome() {
        println("Método exibe nome: $nome")
    }
}