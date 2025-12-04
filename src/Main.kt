//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val employeeList: MutableList<Employee> = mutableListOf(
        Developer("Maria", 2700.0),
        Manager("Ana", 3000.0),
        Designer("Carlos", 2500.0),
        Developer("Alejandro", 4000.0),
        Manager("Laura", 2800.0),
        Designer("Diego", 3900.0)
    )

    for (i in employeeList) {
        i.evaluatePerformance()
        println(i.detailsEmployee())
        i.work()
        i.calculateAnnualBonus()
        println() //creo un enter
    }
}