fun main() {
    //PRIMEIRA PARTE
    /*var opcao = 4
    when (opcao) {
        1 -> {
            println("Café com leite." +
                    "\nMelhor opção da Casa!")
        }
        2 -> println("Chocolate quente")
        else -> println("Nenhuma opção selecionada. " +
                "\nSelecione uma opção!!")
    }*/

    //SEGUNDA PARTE
    /*var opcao = 3
    when (opcao) {
        1, 2 -> {
            println("Café puro" +
                    "\nLeite separado")
        }
        3 -> println("Chocolate quente")
        else -> println("Nenhuma opção selecionada. " +
                "\nSelecione uma opção!!")
    }*/

    //TERCEIRA PARTE
    /*var opcao = 3
    when (opcao) {
        1 -> println("Café puro")
        2 -> println("Chocolate quente")
        else -> println("Nenhuma opção selecionada")
    }*/

    var opcao = 1
    var result = when (opcao) {
        1 -> "Café puro"
        2 -> "Chocolate quente"
        else -> "Nenhuma opção selecionada"
    }
    println("Resultado: $result")
}