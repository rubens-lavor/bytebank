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
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    return Array(valores.size) { indice ->
        valores[indice].toBigDecimal()
    }
}