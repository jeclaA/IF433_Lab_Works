package oop_00000110617_jesslynclarestasanders.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Alex"
        age = 35
    }
    println(user)
}