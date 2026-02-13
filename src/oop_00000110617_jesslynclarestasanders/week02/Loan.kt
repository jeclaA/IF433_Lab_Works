package oop_00000110617_jesslynclarestasanders.week02

import java.util.Scanner

class Loan (
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        if (loanDuration > 3) {
            return (loanDuration - 3) * 2000
        } else {
           return 0
        }
    }

}
fun main()  {
    val scanner = Scanner(System.`in`)
    print("Masukkan Judul: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam: ")
    var loanDuration = scanner.nextInt()

    if (loanDuration < 0) {
        loanDuration = 1
    }

    val loan = Loan(bookTitle, borrower, loanDuration)

    // Output detail
    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam     : ${loan.borrower}")
    println("Lama Pinjam  : ${loan.loanDuration} hari")
    println("Total Denda  : Rp ${loan.calculateFine()}")
}
