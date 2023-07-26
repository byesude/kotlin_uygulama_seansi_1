package com.example.uygulamaseansi.uygulamaseansi1_25072023.soru5
/*
Kullanıcıdan bir ay ismi girmesini isteyen ve bu aya göre mevsim bilgisini ekrana yazdıran bir programı
nasıl yazarsınız?
 */
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Bir ay ismi giriniz: ")
    val ayIsmi = scanner.nextLine().toLowerCase()

    val mevsim = when (ayIsmi) {
        "aralık", "ocak", "şubat" -> "Kış"
        "mart", "nisan", "mayıs" -> "İlkbahar"
        "haziran", "temmuz", "ağustos" -> "Yaz"
        "eylül", "ekim", "kasım" -> "Sonbahar"
        else -> "Geçersiz ay ismi"
    }

    println("$ayIsmi ayı mevsimi: $mevsim")

    scanner.close()
}
