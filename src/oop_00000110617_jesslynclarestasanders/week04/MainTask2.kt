package oop_00000110617_jesslynclarestasanders.week04

fun main() {

    val manager = Manager("Jeci", 11_000_000)
    val developer = Developer("Pina", 7_000_000, "Kotlin")

    println("--- Manager ---")
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println("\n--- Developer ---")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}