class Developer(nombre: String, salario: Double) : Empleados(nombre, salario) {
    override fun work() {
        println("Developer: Writing and reviewing code.")
    }

    override fun calculateAnnualBonus(): Double {
        val bonus = salario * 0.10
        println("Developer: You have a bonus of $bonus")
        return bonus
    }

    override fun evaluatePerformance() {

    }
}