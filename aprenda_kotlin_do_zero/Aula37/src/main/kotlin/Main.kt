fun main() {
    exibirMensagem("Jamilton", 28) //Chamando a função
    var result = somar(10, 5)
    println("Resultado Soma: $result")
}

fun somar(n1: Int, n2: Int): Int {
    var total = n1 + n2
    //println("Soma Total $n1 + $n2 = $total")
    return total
}

fun exibirMensagem(nome: String, idade: Int) {
    //Bloco de Código
    println("Alerta, você não preencheu todos os dados!")
    println("$nome, $idade")
}