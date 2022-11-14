package collections

import java.math.BigDecimal
import java.math.RoundingMode

fun salariosBigDecimal(){
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario ->
            if (salario < "5000".toBigDecimal()) {
                salario + "500".toBigDecimal()
            } else {
                salario.times(aumento).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println("Somatório dos salários após o aumento: $gastoInicial")

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(initial = gastoInicial) {
        acumulador, salario -> acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println("gasto total: $gastoTotal")

    val mediaMaioresSalarios = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    println("Média dos 3 maiores salários: $mediaMaioresSalarios")

}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    return Array(valores.size) { indice ->
        valores[indice].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->  acumulador + valor}
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) BigDecimal.ZERO
    else {
        this.somatoria().div(this.size.toBigDecimal())
    }
}
