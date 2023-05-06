/*
* COLLECTIONS / COLEÇÕES
* Collections ou Coleções -> São de estruturas de dados:
*   .List -> Imutável, tamanho fixo, apenas para leitura
*   .ArrayListOf -> Mutável, sem tamanho fixo, pode adicionar ou remover
* */

fun main() {

    /*var listaItens = listOf("SP", "RJ", "MG")
    //listaItens.add = "BA"
    //listaItens[0] = "BA"
    println(listaItens)*/

    /*var listaItens = arrayOf("SP", "RJ", "MG")
    //listaItens.add = "BA" //no add
    //listaItens[0] = "BA" //ok
    println(listaItens)*/

    /*var listaItens = arrayListOf("SP", "RJ", "MG")
    listaItens.add("BA") //ok
    //listaItens.remove("SP")
    //listaItens.removeAt(0)
    //listaItens[0] = "BA" //ok
    println(listaItens)
    println("Total Itens: " + listaItens.size)
    println("Lista Vazia: " + listaItens.isEmpty())*/

    var listaItens = arrayListOf("SP", "RJ", "MG")
    listaItens.add("BA") //ok
    listaItens[0] = "MA" //ok
    println(listaItens)
}