class Designer(name: String, salary: Double) : Employee(name, salary) {
    override fun work() {
        println("Designer: Creating and optimizing visual design.")
    }

    override fun calculateAnnualBonus(): Double {
        val bonus = salary * 0.15
        println("Manager: You have a bonus of $bonus")
        return bonus
    }

    override fun evaluatePerformance() {
        println("Evaluation of $name (Designer)")
    }
}