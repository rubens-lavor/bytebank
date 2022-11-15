package br.com.alura.collections

fun testaMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(Pair(1, 20.0), Pair(2, 30.0), Pair(3, 10.0), 4 to 45.0)
    println(pedidos)

    val pedido1: Double = pedidos[1] ?: 0.0
    println("pedido 1: $pedido1")

    val pedido2: Double? = pedidos[0]
    pedido2?.let {
        println("pedido 2:$it")
    }

    println("----")

    for (pedido: Map.Entry<Int, Double> in pedidos) {
        println("numero do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }

    println("----")

    pedidos[5] = 100.0
    println(pedidos)

    pedidos[5] = 25.0 //atualizando um valor
    pedidos.put(6, 200.0)
    println(pedidos)

    pedidos.putIfAbsent(6, 15.0) //adiciona se a chave não existir
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)

    pedidos.remove(key = 3, value = 100.0) // remove se houver a chave e o valor for o especificado
    println(pedidos)

    pedidos.remove(3, 10.0)
    println(pedidos)
}
