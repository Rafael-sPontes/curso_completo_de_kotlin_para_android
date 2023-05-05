/*
* CONTROLE DE FLUXO DE EXECUÇÃO
*
* if ( condição ) {
*   //Caso a condição seja satisfeita
* }*/

fun main() {
    //PRIMEIRA PARTE
    /*if (true) { println("if (true): Verdadeiro") }
    if (false) { println("if (false): Falso") }
    if (5 == 5) { println("if (5 == 5): Verdadeiro") }
    if (5 == 6) { println("if (5 == 6): Verdadeiro") }*/

    //SEGUNDA PARTE
    /*if (5 == 6) {
        println("if (5 == 6): Verdadeiro")
    } else {
        println("if (5 == 6): Falso")
    }

    if (5 == 6) {
        println("if (5 == 6): Verdadeiro")
    } else {
        println("if (5 == 6): Falso")
    }

    if (5 > 5) {
        println("if (5 > 5): Verdadeiro")
    } else {
        println("if (5 > 5): Falso")
    }

    if (8 > 5) {
        println("if (8 > 5): Verdadeiro")
    } else {
        println("if (8 > 5): Falso")
    }*/

    //TERCEIRA PARTE
    /*if (8 == 5 && 6 == 6) {
        println("if (8 > 5): Verdadeiro")
    } else {
        println("if (8 > 5): Falso")
    }

    if (5 == 5 && 6 == 6) {
        println("if (5 == 5 && 6 == 6): Verdadeiro")
    } else {
        println("if (5 == 5 && 6 == 6): Falso")
    }

    if (4 == 5 && 6 == 6) {
        println("if (4 == 5 && 6 == 6): Verdadeiro")
    } else {
        println("if (4 == 5 && 6 == 6): Falso")
    }*/

    //QUARTA PARTE
    /*if (4 == 5 || 6 == 6) {
        println("if (4 == 5 || 6 == 6): Verdadeiro")
    } else {
        println("if (4 == 5 || 6 == 6): Falso")
    }

    if (4 == 5 || 6 == 5) {
        println("if (4 == 5 || 6 == 5): Verdadeiro")
    } else {
        println("if (4 == 5 || 6 == 5): Falso")
    }

    if (4 == 5 || 6 == 6) {
        println("if (4 == 5 || 6 == 6): Verdadeiro")
    } else {
        println("if (4 == 5 || 6 == 6): Falso")
    }

    if (5 == 5 || 6 == 6) {
        println("if (5 == 5 || 6 == 6): Verdadeiro")
    } else {
        println("if (5 == 5 || 6 == 6): Falso")
    }*/

    //QUINTA PARTE
    /*var idade = 10
    if (idade < 14) {
        println("Criança de $idade Anos")
    } else if (idade >= 14 && idade < 18) {
        println("Adolescente de $idade Anos")
    } else {
        println("Adulto de $idade Anos")
    }*/

    /*var media1 = 8
    if (media1 >= 6) {
        println("Media1: Aprovado")
    } else {
        println("Media1: Reprovado")
    }*/

    /*var media2 = 6
    if (media2 >= 6) {
        println("Media2: Aprovado")
    } else {
        println("Media2: Reprovado")
    }*/

    /*var media3 = 5
    if (media3 >= 6) {
        println("Media3: Aprovado")
    } else {
        println("Media3: Reprovado")
    }*/

    //SEXTA PARTE
    var media1 = 5
    var result1 = if (media1 >= 6) "Aprovado" else "Reprovado"
    println("M=5 if (media1 >= 6): $result1")

    var media2 = 8
    var result2 = if (media2 >= 6) "Aprovado" else "Reprovado"
    println("M=8 if (media2 >= 6): $result2")
}