package com.example.study.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.study.R
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class KoinActivity : AppCompatActivity() {

    val firstPresenter: MySimplePresenter by inject() // inject ile lazy kullanımı 1. kullanım

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koin)

        val secondPresenter: MySimplePresenter = get() // 2. kullanım

        Log.e("Zeki",firstPresenter.sayHello())
        Log.e("Zeki",secondPresenter.sayHello())
    }
}


/*
* Kotlin dili ile yazılmış bir Dependency Injection kütüphanesidir
* koin di olduğu için dagger(hilt) yerine daha basit projelerde kullanılır
* Temelde 2 farklı şekilde obje oluşturulabilir;
* by inject() ile lazy kullanımı
* get() ile direkt setleyerek. // lazy değildir.
* Applicationda koin başlatılıyor
* */