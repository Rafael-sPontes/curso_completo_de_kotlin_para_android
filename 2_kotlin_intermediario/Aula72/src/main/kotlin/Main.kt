/*
* INTERFACE
*
* Pode se dizer a grosso modo, que uma interface é um contrato que
* quando assumido por uma classe deve ser implementado.
*
* Interface é utilizada pois podemos ter muitos objetos (classes) que podem possuir
* a mesma ação (Métodos) porém, podem executá-las de maneira diferente.
* */

fun main() {

    var jamilton = Jamilton()
    jamilton.direitosDeveres()
    jamilton.ganharEleicao()

    var obama = Obama()
    obama.direitosDeveres()
    obama.ganharEleicao()
    obama.temFilho()
}

interface Presidente {
    fun ganharEleicao()
}

interface Pai {
    fun temFilho()
}

open class Cidadao {
    fun direitosDeveres() { println("Todo cidadão tem Direitos e Deveres") }
}

class Obama: Cidadao(), Presidente, Pai {
    override fun ganharEleicao() { println("Ganhar Eleição nos EUA") }
    override fun temFilho() { println("Tem Filho") }
}

class Jamilton: Cidadao(), Presidente {
    override fun ganharEleicao() { println("Ganhar Eleição no Brasil") }
}