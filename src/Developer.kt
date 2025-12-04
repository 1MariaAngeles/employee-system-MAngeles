class Developer(name: String, salary: Double) : Employee(name, salary) {
    override fun work() {
        println("Developer: Writing and reviewing code.")
    }

    override fun calculateAnnualBonus(): Double {
        val bonus = salary * 0.10
        println("Developer: You have a bonus of $bonus")
        return bonus
    }

    override fun evaluatePerformance() {
        println("Evaluation of $name (Developer)")
    }
}