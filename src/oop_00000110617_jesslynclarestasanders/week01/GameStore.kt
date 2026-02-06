package oop_00000110617_jesslynclarestasanders.week01

fun main(){
    val gameTitle: String = "Overcooked"
    val price: Int = 500000
    val hargaAkhir = calculateDiscount(price)
    val userNote: String? = null
    val cek = userNote ?: "Tidak Ada Catatan"
    printReceipt(title = gameTitle, ogPrice = price, finalPrice = hargaAkhir, note = cek)
}
fun calculateDiscount(price: Int) = if(price > 500000) price - (price*20/100) else price - (price*10/100)
fun printReceipt(title: String, ogPrice: Int, finalPrice: Int, note: String) = println("Judul: $title, Harga Asli: $ogPrice, Harga Akhir: $finalPrice, Notes: $note")