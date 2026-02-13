package oop_00000110617_jesslynclarestasanders.week02
import java.util.Scanner
class Hero (
    val name: String,
    var hp: Int = 100,
    val baseDamage: Int
) {
    constructor(name: String, baseDamage: Int) : this(name, 100, baseDamage)

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        if (hp > 0) {
            return true
        } else {
            return false
        }
    }
}
fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("\n=== MENU ===")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Musuh")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh membalas dengan $enemyDamage damage!")
                hero.takeDamage(enemyDamage)

                println("Sisa HP ${hero.name}: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("${hero.name} kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n=== HASIL ===")

    if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.name} MENANG! YAYYYRR")
    } else if (!hero.isAlive()) {
        println("${hero.name} kalah... Musuh menang")
    } else {
        println("Seri! Tidak ada yang Menang.")
    }

}
