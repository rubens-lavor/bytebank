package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double){
        if (valor > 0) {
            saldo += valor
        }
    }

    abstract fun saque(valor: Double)

    fun transfere(contaDestino: Conta, valor: Double, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                message = "O saldo é insuficiente, salto atual: $saldo, valor a ser debitado: $valor"
            )
        }
        if (!autentica(senha)){
            throw FalhaAutenticacaoException()
        }

        saque(valor)
        contaDestino.deposita(valor)
    }
}
