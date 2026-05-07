package oop_00000110617_jesslynclarestasanders.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.68))
    coinRepo.add(Coin("ETH", 10.5))
    coinRepo.add(Coin("USDT", 6700.0))

}