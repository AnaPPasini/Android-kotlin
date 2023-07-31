fun main () {

    var frase = transformacao(2)
    println(frase)

    var valor = cubo(2)
    println(valor)

    troca("Ana Paula Pasini Ghisi")
}
//Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e segundos. Saída desejada:

    fun transformacao (ano:Int) : String {
        var meses = (ano * 12)
        var dias = (ano*365)
        var horas = (dias*24)
        var minutos = (horas*60)
        var segundos = (minutos*60)
        var frase = "Esse ano $ano tem $meses meses, $dias dias, $horas horas, $minutos minutos e $segundos segundos"
        return frase
    }

    //Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres
    fun nome1 (nome:String) {
        println("Seu nome é ${nome} e o tamanho é: ${nome.length}")
    }

    //Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n)
    fun cubo (numero: Int) :String {
    var cubo = numero*numero*numero
        var valor = "O cubo de $numero é $cubo"
        return valor
}
    //Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”
    fun troca (nome2: String) {
        var novoNome = nome2.lowercase()
        novoNome = novoNome.replace("a", "x")
        println("Seu novo nome é ${novoNome}")
    }
