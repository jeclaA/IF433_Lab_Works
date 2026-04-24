package oop_00000110617_jesslynclarestasanders.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 5.2, "CLOSED"),   // profit
        TradeLog("ETHUSDT", "SHORT", 5, -2.3, "CLOSED"),  // loss
        TradeLog("BTCUSDT", "LONG", 15, 3.8, "OPEN"),     // profit (belum close)
        TradeLog("ETHUSDT", "LONG", 8, -1.5, "OPEN"),     // loss (belum close)
        TradeLog("BTCUSDT", "SHORT", 20, 7.1, "CLOSED"),  // profit
        TradeLog("ETHUSDT", "SHORT", 12, -4.0, "CLOSED")  // loss
    )
    tradeHistory.forEach { println(it) }
}