import kotlin.math.floor

fun calcularMontoGiro(montoTotal: Double): Double {
    fun redondearHaciaAbajo(valor: Double): Double = floor(valor * 10) / 10

    fun calcularComision(montoGiro: Double): Double {
        return when {
            montoGiro <= 1000.0 -> 5.0
            montoGiro <= 10001.0 -> montoGiro * 0.005
            else -> montoGiro * 0.015
        }
    }

    fun calcularImpuesto(montoGiro: Double): Double = montoGiro * 0.00005

    // El monto total ya viene redondeado hacia abajo
    var montoGiro = montoTotal

    // Iteramos para encontrar el monto de giro correcto
    while (true) {
        val comision = calcularComision(montoGiro)
        val impuesto = calcularImpuesto(montoGiro)
        val totalCalculado = montoGiro + comision + impuesto

        // Si el total calculado redondeado hacia abajo es igual al monto total,
        // hemos encontrado el monto de giro correcto
        if (redondearHaciaAbajo(totalCalculado) == montoTotal) {
            return redondearHaciaAbajo(montoGiro)
        }

        // Si no, reducimos el monto de giro y seguimos iterando
        montoGiro = redondearHaciaAbajo(montoGiro - 0.1)

        // Si el monto de giro llega a cero o menos, no se encontró una solución válida
        if (montoGiro <= 0) {
            throw IllegalArgumentException("No se pudo calcular el monto de giro para el monto total dado")
        }
    }
}

fun main() {
    println("Ingrese el monto total (redondeado hacia abajo al primer decimal):")
    val montoTotal = readLine()?.toDoubleOrNull()

    if (montoTotal != null) {
        try {
            val montoGiro = calcularMontoGiro(montoTotal)
            println("El monto de giro es: ${String.format("%.1f", montoGiro)}")
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    } else {
        println("Entrada inválida. Por favor, ingrese un número válido.")
    }
}
