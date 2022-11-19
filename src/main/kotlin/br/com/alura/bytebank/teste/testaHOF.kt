package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaHOF() {
    soma(a = 5, b = 5, resultado = (::println))
    soma(1, 5) {
        println(it)
    }

    somaReceiver(a = 5, b = 5, resultado = (::println))
    somaReceiver(a = 5, b = 5, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistema = SistemaInterno()
    sistema.entra(
        admin = autenticavel,
        senha = 1234,
        autenticado = {
            println("Realizar pagamento")
        }
    )

    sistema.entraReceiver(autenticavel, 1234) {
        pagamento()
    }
}

// higher order function -> função que recebe ou retorna outra função
fun soma(a: Int, b: Int, resultado: (Int) -> Unit ) = resultado(a + b)

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit ) {
    val total = a + b
    total.resultado()
}
