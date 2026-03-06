package oop_00000110617_jesslynclarestasanders.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran senilai $amount sukses.")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up senilai $amount sukses.")
    }
}
