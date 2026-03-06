package oop_00000110617_jesslynclarestasanders.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)

}