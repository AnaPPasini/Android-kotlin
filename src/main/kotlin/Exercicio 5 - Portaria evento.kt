//Escreva um programa para ser usado na de portaria de um evento.
//Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
//permitidos.”.
//b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
//destes. Mensagem: “Negado. Convite inválido.”.
//c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
//Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.
//d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.

fun main () {

    println("Qual é o seu nome?")
    var convidado = readln().toString()

    println("Qual a sua idade?")
    var idade = readln().toInt()
    verificaIdade(idade)

    println("Convite?")
    var convite = readln().toString()
    verificaConvite(convite)

    println("Qual o código do convite?")
    var codigo = readln().toString()
    verificaCodigo(codigo)

    println("Welcome :)")

}
fun verificaIdade (idade:Int) {
    if (idade < 18) {
        println("Negado. Menores de idade não são permitidos")
        System.exit(0)
    }
}
fun verificaConvite (convite:String){
    if (convite != "comum" && convite != "premium" && convite != "luxo") {
        println("Negado. Convite inválido")
        System.exit(0)
    }
}
fun verificaCodigo (codigo:String) {
    if (codigo.uppercase() != "XL" && codigo.uppercase() != "XT") {
        println("Negado. Convite inválido")
        System.exit(0)
    }
}





