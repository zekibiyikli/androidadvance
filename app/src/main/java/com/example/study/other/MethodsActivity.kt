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
        //doubles()
        //longs()
        //booleans()
        arraylists()
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

    fun longs(){
        var baseLong=10L

        baseLong.plus(5L)           // 15 => ekleme
        baseLong.minus(5L)          // 5 => çıkartma
        baseLong.dec()              // 9 => bir azaltma
        baseLong.inc()              // 11 => bir arttırma
        baseLong.times(5L)          // 50 => çarpma
        baseLong.unaryMinus()       // -10 => negatifi
        baseLong.unaryPlus()        // 10 => pozitifi
        baseLong.and(5L)            // 0 => AND OPERATION
        baseLong.compareTo(5L)      // 1 => karşılaştırır aynıysa 0 büyükse 1 küçükse -1
        baseLong.div(5L)            // 2 => bölme
        baseLong.inv()              // -11 => bitleri ters çevirir
        baseLong.or(5L)             // 15  => OR OPERATION
        baseLong.rangeTo(5L)        // 10..5 => aralık ayarlama
        baseLong.rem(5L)            // 0 => bölümden kalan
        baseLong.shl(5)             // 320 => bitcount değeri ile sola kaydırır
        baseLong.ushr(5)            // 0 => en soldaki bitleri sıfırlarla doldurarak bitCount sayısı kadar sağa kaydırır.
        baseLong.xor(5L)            // 15 => XOR OPERATION
    }

    fun booleans(){
        var baseBoolean=true

        baseBoolean.and(false)  // false => AND operatörü
        baseBoolean.not()       // false => değili
        baseBoolean.or(false)   // true => OR operatörü
        baseBoolean.xor(false)  // true => XOR operatörü
    }

    fun arraylists(){
        var baseArrayList= arrayListOf("test1","test2","test3","test4","test5","test6","test7","test8","test9","test10")

        baseArrayList[0]                // ilk değeri getirir
        baseArrayList.get(0)            // ilk değeri getirir
        baseArrayList.removeAt(0)       // ilk değeri siler
        baseArrayList.remove("test4")   // "test4" değerini siler
        baseArrayList.set(0,"test4")    // 0. indexe "test4" değerini atar
        baseArrayList.elementAt(0)      // 0. indexteki değeri getirir
        baseArrayList.add("test6")      // "test6" değerini ekler
        baseArrayList.random()          // rastgele değer getirir
        baseArrayList.removeFirst()     // ilk değeri siler
        baseArrayList.isNullOrEmpty()   // boş veya null kontrolü yapar
        baseArrayList.removeLast()      // son değeri siler

        baseArrayList.forEach {
            Log.e("Zeki",it)            // listedeki elemanları sırayla getirir
        }

        baseArrayList.filter {
            it.equals("test1")          // listeyi filtreler
        }

        baseArrayList.map {
            it.equals("test1")          // listeyi istenilen şeye göre mapler mesela burada equals kontrolü olduğu için boolean listesi döner
        }

        baseArrayList.sortBy {
            it                          // listeyi sıralar
        }


    }
}