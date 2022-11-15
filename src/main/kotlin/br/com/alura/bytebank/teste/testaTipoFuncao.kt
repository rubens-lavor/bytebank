package br.com.alura.bytebank.teste

fun testaFucaoAnonima() {
    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(_: Int, b: Int): Int {
        println("Executa como anônima")
        return b
    }
    println(minhaFuncaoAnonima(10, 20))


    println("\n---- funçao anonima com multiplos retornos")
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(1000.0))
    println(calculaBonificacaoAnonima(1100.0))
}

fun testaFuncaoLambda() {
    println("\n---- função lambda")
    val minhaFuncaoLambdaSemParametro: (Int, Int) -> Int = { b, _ ->
        println("Executa como lambda")
        b
    }
    println(minhaFuncaoLambdaSemParametro(11, 10))

    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        println("Executa como lambda")
        a + b
    }
    println(minhaFuncaoLambda(11, 10))

    println("\n---- lambda com multiplos retornos")
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        salario + 100.0
    }
    println(calculaBonificacao(1100.0))
    println(calculaBonificacao(1000.0))

    println("\n---- função anonima")
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(2,3))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5,10))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int {
        return a + b
    }
}
