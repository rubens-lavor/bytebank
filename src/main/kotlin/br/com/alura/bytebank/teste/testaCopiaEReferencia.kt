import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiaEReferencia(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    val joao = Cliente(nome = "joão", cpf = "", senha = 1)
    val contaJoao = ContaCorrente(titular = joao,1000)
    contaJoao.titular.nome = "joao"

    var contaMaria = ContaPoupanca(titular = Cliente(
        nome = "maria",
        cpf = "",
        senha = 1
    ),1001)
    contaMaria.titular.nome = "Maria"

    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println("numero x $numeroX")
    println("numero y $numeroY")
}