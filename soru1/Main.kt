package com.example.uygulamaseansi.uygulamaseansi1_25072023.soru1
/*
Kullanıcıya belirli bir sayı kadar tahmin yapma hakkı veren bir sayı tahmin oyununu nasıl oluşturursunuz?
 */
import kotlin.random.Random

fun main() {
    val enKucukSayi = 1
    val enBuyukSayi = 100
    val maksimumTahminSayisi = 5

    val hedefSayi = Random.nextInt(enKucukSayi, enBuyukSayi + 1)

    println("1 ile 100 arasında bir sayı tuttum. Bakalım kaç tahminde bulabilirsin!")
    println("Tahminlerin için $maksimumTahminSayisi hakkın var.")

    var tahminSayisi = 0
    var tahmin: Int

    while (tahminSayisi < maksimumTahminSayisi) {
        println("Tahmin ettiğin sayı nedir?")
        tahmin = readLine()?.toIntOrNull() ?: continue

        if (tahmin < enKucukSayi || tahmin > enBuyukSayi) {
            println("Geçersiz tahmin! Lütfen $enKucukSayi ile $enBuyukSayi arasında bir sayı girin.")
            continue
        }

        tahminSayisi++

        when {
            tahmin == hedefSayi -> {
                println("Tebrikler! Doğru tahmin ettin. Sayı: $hedefSayi")
                return
            }
            tahmin < hedefSayi -> println("Daha büyük bir sayı dene. Kalan hakkın: ${maksimumTahminSayisi - tahminSayisi}")
            else -> println("Daha küçük bir sayı dene. Kalan hakkın: ${maksimumTahminSayisi - tahminSayisi}")
        }
    }

    println("Üzgünüm, hakkın bitti. Tutulan sayı: $hedefSayi")
}