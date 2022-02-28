package com.example.study

import android.app.Application
import com.example.study.koin.appModule
import dagger.hilt.android.HiltAndroidApp
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

@HiltAndroidApp
class App:Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()

    }

    fun initKoin(){
        startKoin{
            androidLogger(Level.ERROR)
            androidContext(this@App)
            modules(listOf(appModule)) // burada oluşturduğumuz modulleri parametre olarak vermemiz gerekiyor.
        }

    }
}
