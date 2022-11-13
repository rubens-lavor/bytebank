import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import javax.naming.AuthenticationException

fun testaComportamentosConta() {
    val rubens = Cliente(nome = "rubens", cpf = "", senha = 1)
    val contaRubens = ContaPoupanca(titular = rubens, numero = 1001)
    contaRubens.deposita(100.0)
    println(contaRubens.titular)
    println(contaRubens.numero)
    println(contaRubens.saldo)

    val fran = Cliente(nome = "fran", cpf = "", senha = 2)
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

    try {
        contaFran.transfere(contaDestino = contaRubens, valor = 100.0, senha = 1)
        println("transferencia realizada com sucesso")
    } catch (e: SaldoInsuficienteException) {
        println("não foi possível realizar a transferencia")
        println("saldo insuficiente")
        e.printStackTrace()
    } catch (e: AuthenticationException) {
        println("falha na transferencia")
        println("falha na autenticação")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println(contaRubens.saldo)
    println(contaFran.saldo)
}