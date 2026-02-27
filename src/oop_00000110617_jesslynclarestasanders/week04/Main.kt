package oop_00000110617_jesslynclarestasanders.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myEC = ElectricCar("Tesla", 6, 85)
    myEC.openTrunk()
    myEC.honk()
    myEC.accelerate()
}