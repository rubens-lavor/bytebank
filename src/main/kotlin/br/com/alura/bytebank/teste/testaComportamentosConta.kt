import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val rubens = Cliente(nome = "rubens", cpf = "", senha = 1)
    val contaRubens = ContaPoupanca(titular = rubens, numero = 1001)
    contaRubens.deposita(100.0)
    println(contaRubens.titular)
    println(contaRubens.numero)
    println(contaRubens.saldo)

    val fran = Cliente(nome = "fran", cpf = "", senha = 1)
    val contaFran = ContaCorrente(numero = 1002, titular = fran)
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