package com.example.uygulamaseansi.uygulamaseansi1_25072023.soru4
/*
Kullanıcıdan bir harf girmesini isteyen ve bu harfin sesli veya sessiz harf olduğunu ekrana yazdıran
bir programı nasıl yazarsınız?
 */
fun main() {
    println("Bir harf giriniz:")
    val harf = readLine()?.toLowerCase()?.getOrNull(0)

    if (harf == null) {
        println("Geçersiz giriş! Lütfen bir harf giriniz.")
        return
    }

    if (harf in 'a'..'z') {
        val sesliHarfler = setOf('a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü')

        if (harf in sesliHarfler) {
            println("$harf harfi sesli bir harftir.")
        } else {
            println("$harf harfi sessiz bir harftir.")
        }
    } else {
        println("Girilen karakter bir harf değil.")
    }
}
