fun main() {
    println("Bem vindo ao Bytebank")

    val contaRubens = Conta()
    contaRubens.titular = "Rubens"
    contaRubens.numero = 1001
    contaRubens.deposita(100.0)
    println(contaRubens.titular)
    println(contaRubens.numero)
    println(contaRubens.saldo)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1002
    contaFran.deposita(200.0)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("depositando na conta do Rubens")
    contaRubens.deposita(50.0)
    println(contaRubens.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do rubens")
    contaRubens.saque(100.0)
    println(contaRubens.saldo)

    println("sacando na conta da fran")
    contaFran.saque(150.0)
    println(contaFran.saldo)

    println("transferencia da conta da fran para o rubens")

    if (contaFran.transfere(contaRubens, 100.0)) {
        println("transferencia realizada com sucesso")
    } else {
        println("não foi possível realizar a transferencia")
    }

    println(contaRubens.saldo)
    println(contaFran.saldo)

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
        private set

    fun deposita(valor: Double){
        if (valor > 0) {
            saldo += valor
        }
    }

    fun saque(valor: Double){
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

fun testaCopiaEReferencia(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    val contaJoao = Conta()
    contaJoao.titular = "João"

    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println("numero x $numeroX")
    println("numero y $numeroY")
}

fun testaLacos() {
    var i = 1

    while (i <= 5) {
        val titular = "Rubens $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()

        i++
    }

    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }

    for (i in 5 downTo 1 step 1) {

        if (i == 4) {
            break
        }

        val titular = "Rubens $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()

    }
}

fun testarCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}