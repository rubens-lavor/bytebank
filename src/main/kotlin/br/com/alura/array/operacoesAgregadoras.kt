package br.com.alura.array

fun operacoesAgregadoras(){
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)

    val maiorIdade = idades.max()

    println("Maior idade: $maiorIdade")

    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    val media = idades.average()
    println("media: $media")

    val todosMaioresDeIdade = idades.all { it >= 18 }
    println("Todos maiores? $todosMaioresDeIdade")

    val existeMaiorDeIdade = idades.any { it >= 18 }
    println("Algum aluno pe aior de idade? $existeMaiorDeIdade")

    val maioresDeIdade: List<Int> = idades.filter { it >= 18 }
    println("maiores de 18 anos: $maioresDeIdade")

    val busca = idades.find { it > 18 }
    println("Busca: $busca")
}