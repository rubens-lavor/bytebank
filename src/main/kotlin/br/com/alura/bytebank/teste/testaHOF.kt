package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaHOF() {
    soma(a = 5, b = 5, resultado = (::println))
    soma(1, 5) {
        println(it)
    }

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(
        admin = autenticavel,
        senha = 1234,
        autenticado = {
            println("Realizar pagamento")
        }
    )
}

// higher order function -> função que recebe ou retorna outra função
fun soma(a: Int, b: Int, resultado: (Int) -> Unit ) = resultado(a + b)
