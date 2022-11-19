package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaFuncoesEscopo() {
    println("\n----")
    val void1: Unit = Endereco(logradouro = "rua vergueiro", numero = 10)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".uppercase()
        }.let(::println)

    println("\n----")
    val str: String = Endereco(logradouro = "rua vergueiro", numero = 10)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".uppercase()
        }.apply(::println)

    println("\n----")
    val endereco: Endereco = Endereco(logradouro = "rua vergueiro", numero = 10)
        .apply {
            println("${this.logradouro}, ${this.numero}".uppercase())
        }

    println("\n----")
    val void2: Unit = Endereco(logradouro = "rua vergueiro", numero = 10)
        .apply {
            "${this.logradouro}, ${this.numero}".uppercase()
        }.let(::println)

    println("\n----")
    val void3: Unit = Endereco(logradouro = "rua vergueiro", numero = 10)
        .run {
            "${this.logradouro}, ${this.numero}".uppercase()
        }.let(::println)

    println("\n----")

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter { endereco -> endereco.complemento.isNotEmpty() }
        .let(::println)
}


/*
run() sem extensão para executar qualquer instrução retornando ou não uma computação.
also() para imprimir o que está acontecendo no código e devolver o objeto de contexto.
apply() para inicializar o objeto de contexto e devolvê-lo.
with() para computar e devolver algo utilizando os membros do objeto de contexto.
 */
