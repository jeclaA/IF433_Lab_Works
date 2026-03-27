package oop_00000110617_jesslynclarestasanders.week07

fun processEvent(event: BattleState) {
    val message = when (event) {
        is BattleState.MonsterEncounter -> {
            "[Monster muncul rGrggrH]: ${event.monsterName}! Bersiaplah;)!"
        }
        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            "Yayy kamu mendapatkan item: $name [Rarity: $rarity, Damage: $damage] "
        }
        is BattleState.GameOver -> {
            "[OH No.. Game Over!] Alasan: ${event.reason}"
        }
        BattleState.SafeZone -> {
            "[Tenang..] Kamu lagi di Safe Zone! Sementara ini masih aman bos"
        }
    }
    println(message)
}