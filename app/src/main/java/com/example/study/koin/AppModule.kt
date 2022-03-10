package com.example.study.koin

import android.view.LayoutInflater
import com.example.study.databinding.ActivityAlertDialogBinding
import io.reactivex.schedulers.Schedulers.single
import org.koin.dsl.module

val appModule = module {
    // single instance of HelloRepository
    single<HelloRepository> { HelloRepositoryImpl() }
    // Simple Presenter Factory
    factory { MySimplePresenter(get()) }

    factory { (layoutInflater: LayoutInflater)->
        ActivityAlertDialogBinding.inflate(layoutInflater)
    }

}

/*
* * get() kullanımı ile gerekli tipteki değişkeni alıp otomatik olarak kullanabiliyoruz Koin ile.
* single anahtar kelimesi objenin bir defa oluşturulmasını sağlıyor.
* factory anahtar kelimesiyle ise obje her inject edildiğinde baştan oluşturuluyor.
* */