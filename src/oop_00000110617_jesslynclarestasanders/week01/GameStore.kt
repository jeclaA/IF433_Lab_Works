package oop_00000110617_jesslynclarestasanders.week01

fun main(){
    val gameTitle: String = "Overcooked"
    val price: Int = 500000
    val hargaAkhir = calculateDiscount(price)
}
fun calculateDiscount(price: Int) = if(price > 500000) price - (price*20/100) else price - (price*10/100)