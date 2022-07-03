package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val cleide = Pessoa (nome = "Cleide Pereira", cpf = 12312312300)
    println(cleide.nome)
    println(cleide.cpf)

    val joao = Funcionario( "Cleide Pereira",12312312300, BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}
