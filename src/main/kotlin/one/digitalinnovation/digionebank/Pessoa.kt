package one.digitalinnovation.digionebank

class Pessoa{
    val nome: String = "Cleide"
    var cpf: String = "123.123.123-00"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val cleide = Pessoa ()

    println(cleide.pessoaInfo())
}
