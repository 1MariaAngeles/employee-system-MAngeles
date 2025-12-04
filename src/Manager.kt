class Manager(nombre: String, salario: Double) : Empleados(nombre, salario) {
    override fun work() {
        println("Manager: Supervising the team and planning projects.")
    }

    override fun calculateAnnualBonus(): Double {
        val bonus = salario * 0.20
        println("Manager: You have a bonus of $bonus")
        return bonus
    }

    override fun evaluatePerformance() {

    }
}