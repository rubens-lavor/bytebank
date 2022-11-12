package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val endereco = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "casa",
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "casa",
        cep = "00000-000"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())


    println(endereco.toString())
    println(enderecoNovo.toString())
}

fun imprime(valor: Any = 0) {
    println(valor)
}
