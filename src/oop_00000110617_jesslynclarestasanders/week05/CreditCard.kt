package oop_00000110617_jesslynclarestasanders.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Transaksi senilai $amount sukses.")
        } else {
            println("Jumlah melebihi limit kartu. Transaksi ditolak.")
        }
    }
}
