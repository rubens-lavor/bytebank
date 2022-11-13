package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaAny() {
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