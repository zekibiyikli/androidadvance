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
        ints()
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

        Log.e("Zeki_8",baseInt.plus(5).toString())       // 15 => Ekleme
        Log.e("Zeki_6",baseInt.minus(5).toString())      // 5 => çıkartma
        Log.e("Zeki_3",baseInt.dec().toString())         // 9 => bir azaltma
        Log.e("Zeki_12",baseInt.times(5).toString())     // 50 => çarpma
        Log.e("Zeki_13",baseInt.unaryMinus().toString()) // -10 => negatifi döndürür
        Log.e("Zeki_14",baseInt.unaryPlus().toString())  // 10 => pozitifi döndürür
        Log.e("Zeki_1",baseInt.and(5).toString())        // 0 => AND OPERATION
        Log.e("Zeki_2",baseInt.compareTo(5).toString())  // 1 => karşılaştırır aynıysa 0 büyükse 1 küçükse -1
        Log.e("Zeki_4",baseInt.div(5).toString())        // 2 => bölme
        Log.e("Zeki_5",baseInt.inv().toString())         // -11 => bitleri ters çevirir
        Log.e("Zeki_7",baseInt.or(5).toString())         // 15  => OR OPERATION
        Log.e("Zeki_9",baseInt.rangeTo(5).toString())    // 10..5 => aralık ayarlama
        Log.e("Zeki_10",baseInt.rem(5).toString())       // 0 => bölümden kalan
        Log.e("Zeki_11",baseInt.shl(5).toString())       // 320 => bitcount değeri ile sola kaydırır
        Log.e("Zeki_15",baseInt.ushr(5).toString())      // 0 => en soldaki bitleri sıfırlarla doldurarak bitCount sayısı kadar sağa kaydırır.
        Log.e("Zeki_16",baseInt.xor(5).toString())       //15 => XOR OPERATION
    }
}