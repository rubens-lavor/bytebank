import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        "fran",
        1001
    )

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
