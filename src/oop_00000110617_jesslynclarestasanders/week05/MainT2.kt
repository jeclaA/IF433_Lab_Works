package oop_00000110617_jesslynclarestasanders.week05

fun main() {

    val eWallet = EWallet("jeci", 50000.0)
    val creditCard = CreditCard("jeci", 100000.0)
    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)
    for (payment in paymentMethods) {
        payment.processPayment(75000.0)
    }
}
