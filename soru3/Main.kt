package com.example.uygulamaseansi.uygulamaseansi1_25072023.soru3
/*
Bir kullanıcının sınav notuna göre, eğer notu 70 ve üzeriyse "Geçtiniz", aksi halde "Kaldınız"
mesajını veren bir programı nasıl yazarsınız?
 */
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Sınav notunuzu girin: ")

    val sinavNotu = scanner.nextInt()

    if (sinavNotu >= 70) {
        println("Tebrikler! Geçtiniz.")
    } else {
        println("Maalesef, kaldınız.")
    }

    scanner.close()
}
