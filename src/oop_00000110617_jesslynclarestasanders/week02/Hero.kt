package oop_00000110617_jesslynclarestasanders.week02

import oop_00000110617_jesslynclarestasanders.week02.Student

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
