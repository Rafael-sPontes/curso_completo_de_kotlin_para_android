/*
* ENUM (ENUMERADORES
* Enum (Enumeração) -> é um tipo de dados que
* consiste em um conjunto de constantes.
* */

fun main() {

    val pedido = Pedido()
    pedido.status = StatusPedido.APROVADO

    if (pedido.status == StatusPedido.PROCESSANDO) {
        println("Pedido está sendo processado!")
    } else if (pedido.status == StatusPedido.APROVADO) {
        println("Pedido foi aprovado!")
    }
}

enum class StatusPedido {
    PROCESSANDO, APROVADO, REPROVADO
}

class Pedido {
    var status: StatusPedido = StatusPedido.PROCESSANDO
}