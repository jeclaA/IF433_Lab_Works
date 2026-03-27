package oop_00000110617_jesslynclarestasanders.week07

fun main() {
    println("=== TEST GAME MANAGER (SINGLETON) ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TEST FACTORY & ENUM ===")
    println("Drop chance Legendary Item: ${ItemRarity.LEGENDARY.dropChance}")

    val starterWeapon = Weapon.forgeStarterSword()
    println("\n[Senjata awal]")
    println("Nama: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")

    println("\n=== TEST IMMUTABILITY & EVENT ===")
    val upgradedItem = starterWeapon.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}
