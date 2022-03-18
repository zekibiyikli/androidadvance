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

        strings()
    }

    fun strings(){
        var baseString="Merhaba Ben Zeki"

        baseString[2].toString() //r
        baseString.substring(2) //rhaba Ben Zeki
        baseString.substring(2,5) //rha
        baseString.toUpperCase() //MERHABA BEN ZEKİ
        baseString.toLowerCase() //merhaba ben zeki
        baseString.equals("Merhaba Ben Ahmet").toString() //false
        baseString.equals("Merhaba Ben Zeki").toString() //true
        baseString.plus(" Bıyıklı") //Merhaba Ben Zeki Bıyıklı
        baseString.replace("Zeki","Bıyıklı") //Merhaba Ben Bıyıklı
        baseString.length.toString() //16
        baseString.drop(4) //aba Ben Zeki
        baseString.dropLast(4) //Merhaba Ben
        baseString.removeRange(1..4) //Mba Ben Zeki
        baseString.reversed() //ikeZ neB abahreM
        baseString.trim() //Merhaba Ben Zeki
        baseString.split("Ben").toString() //[Merhaba ,  Zeki]

    }
}