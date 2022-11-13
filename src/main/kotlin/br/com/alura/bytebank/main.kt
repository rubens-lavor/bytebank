package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaExpressao
import java.lang.ClassCastException

fun main() {
    println("início main")
    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        println(e.message)
        println(e.stackTrace)
        println(e.cause)
        e.printStackTrace()
        println("ClassCastException foi capturada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        val endereco = Any()
        throw ClassCastException()
    }
    println("fim funcao2")
}
