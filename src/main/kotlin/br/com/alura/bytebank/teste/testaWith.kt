package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaWith() {
    with(Endereco()) {
        logradouro = "rua vergueiro"
        numero = 10
        bairro = "vila mariana"
        cidade = "são paulo"
        estado = "SP"
        cep = "11111-001"
        complemento = "apto"
        completo()
    }.let { println(it) }
}
