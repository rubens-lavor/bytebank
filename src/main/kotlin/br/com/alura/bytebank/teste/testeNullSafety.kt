package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco
import java.lang.IllegalStateException


fun testeNullSafety() {
    var endereco: Endereco? = Endereco(logradouro = "rua alguma coisa", complemento = "apto")
    endereco?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int = it.complemento?.length ?: throw IllegalStateException("Complemento vazio")
        println(tamanhoComplemento)
    }

    teste("")
    teste(1)
}

fun teste(valor: Any) {
    val numero: Int? = valor as? Int // safe cast
    println(numero)
}
