fun main (){

//1 - Imprima os números de 1 a 50 na mesma linha em ordem crescente.

//    var n = 0
//    while (n <= 50) {
//        print("$n ")
//        n++
//    }

//2 - Imprima os números de 1 a 50 na mesma linha em ordem decrescente.

//    var n2 = 50
//    while (n2 >= 0) {
//        print("$n2 ")
//        n2--
//    }

//3 - Usando a resolução do exercício 1, não imprima os números múltiplos de 5
//    var n = 0
//    while (n <= 50) {
//        if (n % 5 == 0)
//        print("$n ")
//        n++
//    }

//4 - Faça a soma de todos os números no intervalo de 1 a 500
//    var soma = 0
//    for (n in 1..500) {
//        soma += n
//    }
//    print("A soma é dos números de 1 a 500 é $soma")

//6 - Considere uma caixa d’água de 2 mil litros. Rômulo gostaria de encher a caixa d’água com balões de água de 7 litros.
// Quantos balões cabem na caixa d’água sem que o volume seja excedido

//    var caixa = 2000
//    var balao = 7
//    var divisao = caixa / balao
//    println("Cabem $divisao balões dentro de uma caixa d'água")


}

// 5 - Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N usando o caracter #.

fun tamanho (n:Int){
    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
    }
        println()
    }

}
