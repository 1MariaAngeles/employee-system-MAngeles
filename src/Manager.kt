class Manager(name: String, salary: Double) : Employee(name, salary) {
    override fun work() {
        println("Manager: Supervising the team and planning projects.")
    }

    override fun calculateAnnualBonus(): Double {
        val bonus = salary * 0.20
        println("Manager: You have a bonus of $bonus")
        return bonus
    }

    override fun evaluatePerformance() {
        println("Evaluation of $name (Manager)")
    }
}