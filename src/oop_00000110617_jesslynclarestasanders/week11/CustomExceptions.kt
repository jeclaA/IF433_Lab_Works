package oop_00000110617_jesslynclarestasanders.week11

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")