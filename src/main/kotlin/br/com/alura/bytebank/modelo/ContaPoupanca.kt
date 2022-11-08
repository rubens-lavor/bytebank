package br.com.alura.bytebank.modelo

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero) {
    override fun saque(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}