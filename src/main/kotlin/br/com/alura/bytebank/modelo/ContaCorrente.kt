package br.com.alura.bytebank.modelo

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun saque(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}