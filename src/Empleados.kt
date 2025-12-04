abstract class Empleados(
    val nombre: String,
    val salario: Double
) : EvaluatePerformance {

    abstract fun work()
    abstract fun calculateAnnualBonus(): Double

    override abstract fun evaluatePerformance()

    fun detailsEmployee(): String {
        return "Nombre: $nombre, Salario: $salario"
    }
}