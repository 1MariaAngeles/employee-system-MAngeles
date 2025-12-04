class Designer(nombre: String, salario: Double) : Empleados(nombre, salario) {
    override fun work() {
        println("Designer: Creating and optimizing visual design.")
    }

    override fun calculateAnnualBonus(): Double {
        val bonus = salario * 0.15
        println("Manager: You have a bonus of $bonus")
        return bonus
    }

    override fun evaluatePerformance() {

    }
}