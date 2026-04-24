package oop_00000110617_jesslynclarestasanders.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 5.2, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 5, -2.3, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 15, 3.8, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 8, -1.5, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 20, 7.1, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 12, -4.0, "CLOSED")
    )
    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }
    val winningTrades = closedTrades
        .filter { it.roe > 0 }
    val losingTrades = closedTrades
        .filter { it.roe <= 0 }
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("\n=== CRYPTO TRADING DASHBOARD ===\n")
    println("Top Performers:")
    topPerformersString.forEach { println(it) }

    println("\nWorst Performers:")
    worstPerformersString.forEach { println(it) }

    println("\nUnique Pairs:")
    println(uniquePairs)
}
