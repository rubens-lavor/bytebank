package collections

fun main() {
    val idades: IntArray = intArrayOf(25,19,33,20,55,40)

    var maiorIdade = idades.get(0)
    for (idade: Int in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("maior idade: $maiorIdade")

    var menorIdade = idades.get(0)
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println("menor idade: $menorIdade")
}
