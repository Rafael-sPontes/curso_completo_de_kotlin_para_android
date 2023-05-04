fun main() {
    val casa1 = Casa()
    println(" -CASA 1-")
    casa1.cor = "Amarela"
    println("Casa de Cor: " + casa1.cor)
    casa1.abrirJanela(1)
    print("\n")

    val casa2 = Casa()
    println(" -CASA 2-")
    casa2.cor = "Vermelha"
    println("Casa de Cor: " + casa2.cor)
    casa2.abrirPorta(2)
    print("\n")

    var casa3 = Casa()
    println(" -CASA 3-")
    casa3.cor = "Azul"
    println("Casa de Cor: " + casa3.cor)
    casa3.abrirCasa(3)
}

class Casa {
    //ATRIBUTOS
    var cor: String = ""

    //MÉTODOS
    fun abrirJanela(nJan: Int) { println("Total de Janelas: $nJan") }

    fun abrirPorta(nPor: Int) { println("Total de Portas: $nPor") }

    fun abrirCasa(nCasa: Int) {
        this.abrirJanela(nCasa)
        this.abrirPorta(nCasa)
    }
}