package oop_00000110617_jesslynclarestasanders.week05

fun main() {

    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(7)
    val luasPersegiPanjang = mathHelper.hitungLuas(7, 17)
    val luasLingkaran = mathHelper.hitungLuas(7.0)

    println("Luas Persegi: $luasPersegi")
    println("Luas Persegi Panjang: $luasPersegiPanjang")
    println("Luas Lingkaran: $luasLingkaran")

}