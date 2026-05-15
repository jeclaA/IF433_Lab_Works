package oop_00000110617_jesslynclarestasanders.week11

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}