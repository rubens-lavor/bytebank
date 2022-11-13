package collections

fun aumentoSalarial(){
    val salarios: DoubleArray = doubleArrayOf(
        1500.0,
        2300.0,
        5000.0,
        8000.0,
        10000.0
    )
    val aumento = 1.1
    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice]*aumento
    }

    println(salarios.contentToString())

    salarios.forEachIndexed { indice, salario ->
        salarios[indice] = salario*aumento
    }

    println(salarios.contentToString())
}