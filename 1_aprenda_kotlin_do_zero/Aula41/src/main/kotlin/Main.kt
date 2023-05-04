fun main() {

    val casa = Casa("Amarela", 2)
    /*casa.cor = "Amarela"
    casa.vagasGaragem = 2*/
    casa.detalhesCasa()
}
//Classe Casa com Construtor Primário e Declaração de Variáveis (var)
class Casa(var cor: String, var vagasGaragem: Int) {

    /*
    //ATRIBUTOS
    var cor: String = ""
    var vagasGaragem: Int = 0

    //Construtor Secundário
    constructor(cor: String, vagasGaragem: Int) {
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }
    */

    //Construtor Primário
    /*init {
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }*/

    //MÉTODOS
    fun detalhesCasa() { println("Casa de Cor: $cor, Vagas: $vagasGaragem") }

    fun abrirJanela(nJan: Int) { println("Total de Janelas: $nJan") }

    fun abrirPorta(nPor: Int) { println("Total de Portas: $nPor") }

    fun abrirCasa(nCasa: Int) {
        this.abrirJanela(nCasa)
        this.abrirPorta(nCasa)
    }
}