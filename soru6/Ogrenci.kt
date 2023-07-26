package com.example.uygulamaseansi.uygulamaseansi1_25072023.soru6
/*
Bir "Öğrenci" adlı sınıf oluşturun ve öğrencilerin adı, soyadı ve sınıfı gibi özellikleri içeren özellikleri
tanımlayın. Ardından, bu sınıftan beş öğrenci nesnesi oluşturun ve bu öğrencilerin özelliklerini ekrana
yazdıran bir fonksiyon yazın
 */
class Ogrenci(val ad: String, val soyad: String, val sınıf: String)

fun main() {

    val ogrenci1 = Ogrenci("Kübra", "Dağ", "10-A")
    val ogrenci2 = Ogrenci("Naime", "Batı", "11-B")
    val ogrenci3 = Ogrenci("Ayşe", "Ok", "9-C")
    val ogrenci4 = Ogrenci("Ecem", "Ozan", "12-D")
    val ogrenci5 = Ogrenci("Meryem", "Bor", "10-A")

    fun ogrenciBilgisiYazdır(ogrenci: Ogrenci) {
        println("Adı: ${ogrenci.ad}")
        println("Soyadı: ${ogrenci.soyad}")
        println("Sınıfı: ${ogrenci.sınıf}")
        println()
    }

    println("Öğrenci Bilgileri:")
    ogrenciBilgisiYazdır(ogrenci1)
    ogrenciBilgisiYazdır(ogrenci2)
    ogrenciBilgisiYazdır(ogrenci3)
    ogrenciBilgisiYazdır(ogrenci4)
    ogrenciBilgisiYazdır(ogrenci5)
}
