package br.com.alura.bytebank.teste


fun testaExpressao() {
    val entrada: String = "1.9"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("problema de conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor recebido com taxa: $valorComTaxa")
    } else {
        println("valor inválido")
    }
}
