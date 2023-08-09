fun main () {
    //Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final
    //do ano. Os bônus são classificados por cargo

    pagamento("gerente",2)

    }
    fun pagamento (funcionario: String, tempo: Int) {

//        //usando when
//        when (funcionario){
//            "gerente" -> println("Seu bônus é 2000 reais")
//            "coordenador" -> println("Seu bônus é 1500 reais")
//            "engenheiro de software" -> println("Seu bônus é 1000 reais")
//            "estágiario" -> println("Seu bônus é 500 reais")
//        }

//        // usando if e else
//        if (funcionario == "gerente") {
//            println("Seu bônus é 2000 reais")
//        }
//       else if (funcionario == "coordenador") {
//            println("Seu bônus é 1500 reais")
//        }

        //Considerar o tempo de experiência no cálculo de bônus

        if (funcionario == "gerente" && tempo <2) {
            println("Seu bônus é 2000 reais")
       }
       else if (funcionario == "gerente" && tempo >=2){
           println("Seu bônus é 3000 reais")
       }
        else if (funcionario == "coordenador" && tempo <1) {
            println("Seu bônus é 1500 reais")
        }
        else if (funcionario == "coordenador" && tempo >=1) {
            println("Seu bônus é 1800 reais")
        }

    }