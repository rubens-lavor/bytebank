package collections.list

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it?.titulo} de ${it?.autor}"
    }
    println(" #### Lista de Livros #### \n$textoFormatado")
}