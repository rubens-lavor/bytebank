package br.com.alura.collections

fun testaAssociacaoEAgrupamento() {

    val pedidos = listOf(
        Pedido(numero = 1, valor = 10.0),
        Pedido(numero = 2, valor = 30.0),
        Pedido(numero = 3, valor = 50.0),
        Pedido(numero = 4, valor = 60.0),
        Pedido(numero = 5, valor = 80.0)
    )
    println(pedidos)

    println("\n----- associateBy")

//    val pedidosMapeados: Map<Int, Pedido> = pedidos.associate { pedido: Pedido ->
//        Pair(pedido.numero, pedido)
//    }
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    println("\n----- associateWith")

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido: Pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero=1, valor=10.0)])

    println("\n----- groupBy")

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratisAgrupados)
    println("Com frete gratis: ${pedidosFreteGratisAgrupados[true]}")
    println("Sem frete gratis: ${pedidosFreteGratisAgrupados[false]}")

    println("\n---- agenda usando o groupBy")

    val nomes = listOf(
        "alex",
        "fran",
        "gui",
        "rubens",
        "maria",
        "paulo",
        "roberto"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }

    println(agenda)
    println(agenda['r'])
}

data class Pedido(val numero: Int, val valor: Double)
