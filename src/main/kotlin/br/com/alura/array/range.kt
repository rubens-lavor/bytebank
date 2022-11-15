package br.com.alura.array

fun exemploRanges(){
    val serie: IntRange = 1.rangeTo(10)

    for (s: Int in serie) {
        print("$s ")
    }
    println()

    val numerosPares: IntProgression = 0.until(10) step 2
    val numerosParesReverso: IntProgression = 10 downTo (0) step 2

    val intervalo: ClosedFloatingPointRange<Double> = 1500.0..5000.0
    val salario = 14000.0
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("fora do intervalo")
    }

    val alfabeto: CharRange = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)


    println(serie.toList())
    println(numerosPares.toList())
    println(numerosParesReverso.toList())
}