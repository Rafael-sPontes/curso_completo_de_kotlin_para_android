/*
* SET / MAP
* Set -> Não permite elementos duplicados, é mais rápido que o ArrayList,
* não mantém a ordem dos elementos.
* Map -> É uma implementação chave/valor.
* */

fun main() {

    //PRIMEIRA PARTE
    /*var itens = hashSetOf("a", "b", "c", "c")
    println(itens)

    for (item in itens) { println(item) }*/

    //SEGUNDA PARTE
    /*var itens = hashSetOf(10, 20, 30, 50, 70)
    println(itens)

    for (item in itens) { println(item) }
    */

    //TERCEIRA PARTE
    /*var map = hashMapOf(
        "urso" to "Animal que hiberna",
        "cao" to "Melhor amigo do homem"
    )
    map.put("passaro", "Gosta de voar")
    println(map)*/

    //QUARTA PARTE
    /*var map = hashMapOf(
        "urso" to "Animal que hiberna",
        "cao" to "Melhor amigo do homem"
    )
    map.put("passaro", "Gosta de voar")

    //Exibe tudo
    for (item1 in map) { println(item1) }
    println("\n")
    //Exibe apenas os valores
    for (item2 in map.values) { println(item2) }
    println("\n")
    //Exibe apenas as chaves
    for (item3 in map.keys) { println(item3) }*/

    //QUINTA PARTE
    var map = hashMapOf(
        "urso" to "Animal que hiberna",
        "cao" to "Melhor amigo do homem"
    )
    map.put("passaro", "Gosta de voar")
    map.remove("passaro")

    //Exibe tudo
    for (item1 in map) { println(item1) }
    println("\n")
    //Exibe apenas os valores
    for (item2 in map.values) { println(item2) }
    println("\n")
    //Exibe apenas as chaves
    for (item3 in map.keys) { println(item3) }
}