package com.example.study.other

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.text.toUpperCase
import com.example.study.R

class MethodsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_methods)

        //strings()
        //ints()
        //floats()
        doubles()
    }

    fun strings(){
        var baseString="Merhaba Ben Zeki"

        baseString[2].toString()                            // r
        baseString.substring(2)                             // rhaba Ben Zeki
        baseString.substring(2,5)                           // rha
        baseString.toUpperCase()                            // MERHABA BEN ZEKİ
        baseString.toLowerCase()                            // merhaba ben zeki
        baseString.equals("Merhaba Ben Ahmet").toString()   // false
        baseString.equals("Merhaba Ben Zeki").toString()    // true
        baseString.plus(" Bıyıklı")                         // Merhaba Ben Zeki Bıyıklı
        baseString.replace("Zeki","Bıyıklı")                // Merhaba Ben Bıyıklı
        baseString.length.toString()                        // 16
        baseString.drop(4)                                  // aba Ben Zeki
        baseString.dropLast(4)                              // Merhaba Ben
        baseString.removeRange(1..4)                        // Mba Ben Zeki
        baseString.reversed()                               // ikeZ neB abahreM
        baseString.trim()                                   // Merhaba Ben Zeki
        baseString.split("Ben").toString()                  // [Merhaba ,  Zeki]
    }

    fun ints(){
        var baseInt=10

        baseInt.plus(5)         // 15 => ekleme
        baseInt.minus(5)        // 5 => çıkartma
        baseInt.dec()           // 9 => bir azaltma
        baseInt.inc()           // 11 => bir arttırma
        baseInt.times(5)        // 50 => çarpma
        baseInt.unaryMinus()    // -10 => negatifi
        baseInt.unaryPlus()     // 10 => pozitifi
        baseInt.and(5)          // 0 => AND OPERATION
        baseInt.compareTo(5)    // 1 => karşılaştırır aynıysa 0 büyükse 1 küçükse -1
        baseInt.div(5)          // 2 => bölme
        baseInt.inv()           // -11 => bitleri ters çevirir
        baseInt.or(5)           // 15  => OR OPERATION
        baseInt.rangeTo(5)      // 10..5 => aralık ayarlama
        baseInt.rem(5)          // 0 => bölümden kalan
        baseInt.shl(5)          // 320 => bitcount değeri ile sola kaydırır
        baseInt.ushr(5)         // 0 => en soldaki bitleri sıfırlarla doldurarak bitCount sayısı kadar sağa kaydırır.
        baseInt.xor(5)          // 15 => XOR OPERATION
    }

    fun floats(){
        var baseFloat=10F

        baseFloat.compareTo(5F)     // 1 => karşılaştırır aynıysa 0 büyükse 1 küçükse -1
        baseFloat.dec()             // 9.0 => bir azaltma
        baseFloat.div(5F)           // 2.0 => bölme
        baseFloat.inc()             // 11.0 => arttırma
        baseFloat.minus(5F)         // 5.0 => çıkarma
        baseFloat.plus(5F)          // 15.0 => ekleme
        baseFloat.rem(5F)           // 0.0 => bölümden kalan
        baseFloat.times(5F)         // 50.0 => çarpma
        baseFloat.unaryMinus()      // -10.0 => negatifi
        baseFloat.unaryPlus()       // 10.0 => pozitifi
    }

    fun doubles(){
        var baseDouble=10.0

        baseDouble.compareTo(5.0)       // 1 => karşılaştırır aynıysa 0 büyükse 1 küçükse -1
        baseDouble.dec()                // 9.0 => bir azaltma
        baseDouble.div(5.0)             // 2.0 => bölme
        baseDouble.inc()                // 11.0 => arttırma
        baseDouble.minus(5.0)           // 5.0 => çıkarma
        baseDouble.plus(5.0)            // 15.0 => ekleme
        baseDouble.rem(5.0)             // 0.0 => bölümden kalan
        baseDouble.times(5.0)           // 50.0 => çarpma
        baseDouble.unaryMinus()         // -10.0 => negatifi
        baseDouble.unaryPlus()          // 10.0 => pozitifi

    }
}