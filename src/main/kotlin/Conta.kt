open class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double){
        if (valor > 0) {
            saldo += valor
        }
    }

    open fun saque(valor: Double){
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(contaDestino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            saque(valor)
            contaDestino.deposita(valor)
            return true
        }
        return false
    }
}