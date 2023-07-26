package com.example.uygulamaseansi.uygulamaseansi1_25072023.soru2
/*
Kullanıcının girdiği bir sayının faktöriyelini hesaplayan bir fonksiyonu döngü kullanmadan nasıl yazarsınız?
 */
fun faktoriyelHesapla(sayi: Int): Int {

    if (sayi == 0 || sayi == 1) {
        return 1
    }

    var faktoriyel = 1
    var i = 2

    while (i <= sayi) {
        faktoriyel *= i
        i++
    }

    return faktoriyel
}

fun main() {
    println("Faktöriyelini hesaplamak istediğiniz sayıyı girin:")
    val sayi = readLine()?.toIntOrNull()

    if (sayi == null || sayi < 0) {
        println("Geçersiz giriş! Pozitif bir sayı giriniz.")
        return
    }

    val faktoriyelSonuc = faktoriyelHesapla(sayi)
    println("$sayi!: $faktoriyelSonuc")
}
