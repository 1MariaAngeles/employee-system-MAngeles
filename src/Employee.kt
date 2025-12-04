abstract class Employee(
    val name: String,
    val salary: Double
) : EvaluatePerformance {

    abstract fun work()
    abstract fun calculateAnnualBonus(): Double

    override abstract fun evaluatePerformance()

    fun detailsEmployee(): String {
        return "Nombre: $name, Salario: $salary"
    }
}