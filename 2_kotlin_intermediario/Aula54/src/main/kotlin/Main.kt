/*
* OPERADORES ARITMÉTICOS
* Somar         (+)
* Subtrair      (-)
* Multiplicar   (*)
* Dividir       (/)
* Módulo        (%)
* */

fun main() {

    var n1 = 11
    var n2 = 5
    var resSoma = n1 + n2
    var resSub = n1 - n2
    var resMult = n1 * n2
    var resDiv = n1 / n2
    var resMod = n1 % n2

    println("Soma: $n1 + $n2 = $resSoma" +
            "\nSubtração: $n1 - $n2 = $resSub" +
            "\nMultiplicação: $n1 * $n2 = $resMult" +
            "\nDivisão: $n1 / $n2 = $resDiv" +
            "\nMódulo: $n1 % $n2 = $resMod")

    //println(10 - 5)
}