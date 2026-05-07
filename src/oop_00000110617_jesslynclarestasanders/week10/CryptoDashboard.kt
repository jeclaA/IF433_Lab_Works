package oop_00000110617_jesslynclarestasanders.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.68))
    coinRepo.add(Coin("ETH", 10.5))
    coinRepo.add(Coin("USDT", 6700.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")

    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 250000.0))
    txRepo.add(Transaction("TX002", 670000.0))
    txRepo.add(Transaction("TX003", 760000.0))

}