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
}
