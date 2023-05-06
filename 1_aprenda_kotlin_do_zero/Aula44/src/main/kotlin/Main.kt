fun main() {

    val cao = Cao()
    cao.dormir()
    cao.correr()
    cao.latir()

    println("\n")

    val passaro = Passaro()
    passaro.dormir()
}

open class Animal {
    open fun dormir() {
        print("Dormir")
    }
    fun correr() {
        println("Correr")
    }
}

class Cao: Animal() {
    /*fun dormir() {
        println("Dormir como Cão")
    }*/

    override fun dormir() {
        super.dormir()
        println(" como um Cão")
    }

    fun latir() {
        println("Latir")
    }
}

class Passaro: Animal() {
    /*fun dormir() {
        println("Dormir como Pássaro")
    }*/

    override fun dormir() {
        super.dormir()
        println(" como um Pássaro")
    }
}