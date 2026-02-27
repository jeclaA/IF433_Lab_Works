package oop_00000110617_jesslynclarestasanders.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand){
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}