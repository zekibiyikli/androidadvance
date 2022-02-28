package com.example.study.koin

import io.reactivex.schedulers.Schedulers.single
import org.koin.dsl.module

val appModule = module {
    // single instance of HelloRepository
    single<HelloRepository> { HelloRepositoryImpl() }
    // Simple Presenter Factory
    factory { MySimplePresenter(get()) }
}

/*
* * get() kullanımı ile gerekli tipteki değişkeni alıp otomatik olarak kullanabiliyoruz Koin ile.
* single anahtar kelimesi objenin bir defa oluşturulmasını sağlıyor.
* factory anahtar kelimesiyle ise obje her inject edildiğinde baştan oluşturuluyor.
* */