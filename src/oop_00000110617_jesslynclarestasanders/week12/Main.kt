package oop_00000110617_jesslynclarestasanders.week12

fun main() {
    println("=== TEST TRY AS EXPRESSION ===")
    val inputString = "123A"
    val result: Int = try {
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException) {
        -1
    }
    println("Hasil parsing: $result")
}