package collections

fun testaSet() {
    val assistiramCursoAndroid: Set<String> = setOf("alex", "fran", "gui", "maria")
    val assistiramCursoKotlin: Set<String> = setOf("rubens", "maria", "alex")
    //val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("gui")
    assistiramAmbos.add("paulo")
    assistiramAmbos.add("paulo")
    println(assistiramAmbos)

    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid.union(assistiramCursoKotlin))
//    println(assistiramCursoAndroid union assistiramCursoKotlin)

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    println(assistiramCursoAndroid intersect assistiramCursoKotlin)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("alex")
    println(assistiramList)
    println(assistiramList.toSet())
}
