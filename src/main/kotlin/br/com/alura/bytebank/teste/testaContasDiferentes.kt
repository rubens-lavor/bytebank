import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "alex",
            cpf = "",
            senha = 2,
            endereco = Endereco(
                logradouro = "rua tal",
                numero = 10,
                bairro = "bairro tal",
                cidade = "cidade tal",
                estado = "estado tal",
                cep = "555555-001",
                complemento = "casa"
            )
        ),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "fran", cpf = "", senha = 2),
        1001
    )

    println("endereço titular: ${contaCorrente.titular.endereco.logradouro}")

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupança: ${contaPoupanca.saldo}")
    println()

    contaCorrente.saque(100.0)
    contaPoupanca.saque(100.0)

    println("após saque")
    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(contaPoupanca, 100.0)

    println("após transferencia")
    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupança: ${contaPoupanca.saldo}")
}
