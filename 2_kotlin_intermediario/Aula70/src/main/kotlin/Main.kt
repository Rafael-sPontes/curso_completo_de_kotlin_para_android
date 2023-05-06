/*
* LOOPS
*   while
*   for
* */

fun main() {
    /*while (true) {}
    while (false) {}*/

    /*var num = 1
    while (num <= 5) {
        println("Executado: $num")
        num++
    }*/

    /*for (num in 1..5) {
        println("Executado: $num")
    }*/

    val posts = arrayOf(
        "Descoberto o novo método de tratamento para Diabétes!",
        "Novo curso de Android foi lançado!",
        "Bolsa de valores opera em alta de 2%",
        "Postagem adicionada"
    )

    for ((ind, post) in posts.withIndex()) {
        println("[$ind] $post")
    }
}