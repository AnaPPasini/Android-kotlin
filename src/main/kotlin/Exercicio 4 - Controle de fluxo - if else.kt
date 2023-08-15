//Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura geométrica.
// Informar se formam um quadrado (lados iguais).

fun main () {

    println("Digite o valor a:")
    var a = readln().toInt()

    println("Digite o valor b:")
    var b = readln().toInt()

    if (quadrado(a,b)) {
        println("É um quadrado")
    }
    else {
        println("Não é um quadrado")
    }
}

fun quadrado (a:Int,b:Int):Boolean {
    if (a==b) {
        return true
    }
    else {
        return false
    }

}
