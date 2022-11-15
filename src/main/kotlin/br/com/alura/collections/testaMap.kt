package br.com.alura.collections

fun testaMap() {
    val pedidos: MutableMap<Int, Double?> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 30.0),
        Pair(3, 10.0),
        4 to null,
        5 to 100.0,
        6 to 100.0
    )
    println(pedidos)

//    val valorPedido = pedidos.getValue(0) // se a chave não existe lança uma exceção
//    println(valorPedido)

    println(pedidos.getOrDefault(key = 0, defaultValue = 0.0))
    println(pedidos.getOrElse(0) {
        0.0
    })

    println("----")

    for (numeroDePedido in pedidos.keys) {
        println("pedido: $numeroDePedido")
    }

    for (valorDePedido in pedidos.values) {
        println("valor: $valorDePedido")
    }

    println("----")

    val pedidosFiltrados = pedidos.filter { (numero: Int, valor: Double?) ->
        numero % 2 == 0 && valor != null && (valor > 50.0)
    }

    println(pedidos)
    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor != null && valor > 70.0
    }

    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }

    println(pedidosPares)

    println("---- plus")

    println(pedidos + Pair(7, 90.0))
    println(pedidos + mapOf(8 to 190.0))
    println(pedidos)


    println("---- minus")
    println(pedidos - 1)
    println(pedidos - listOf(2,3))
    println(pedidos)

    println("---- add")
    // pedidos.putAll(setOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0))
    pedidos += setOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0)
    println(pedidos)

    println("---- remove")
    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(element = null)
    println(pedidos)

    pedidos.values.remove(element = 100.0)
    println(pedidos)

    pedidos -= 8
    println(pedidos)


}

private fun exemplosMapPrimeiraAula(pedidos: MutableMap<Int, Double>) {
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
