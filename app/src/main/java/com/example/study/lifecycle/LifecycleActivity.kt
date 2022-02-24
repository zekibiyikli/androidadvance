package com.example.study.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.study.R

class LifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        //Activity ilk açıldığında gerçekleşen olayları içinde barındırır.
    }

    override fun onStart() {
        super.onStart()
        //Bu metod devreye girdiğinde uygulama kullanıcıya görünür hale gelir.
    }

    override fun onResume() {
        super.onResume()
        //Uygulama ön plana gelir. Bu metod kullanıcıyla etkileşime girildiği durumdur. Bu metod telefon çağrısı alana kadar ya da başka bir etkinliğe girene kadar kısaca herhangi bir işlem yapana kadar kalmaktadır.
    }

    override fun onPause() {
        super.onPause()
        //Sistem uygulamanın bir nevi kapandığını bildirdiği zaman çalışır.
    }

    override fun onStop() {
        super.onStop()
        //Kullanıcı uygulamadan çıkış yaptığında buradaki kodlar çalışmaktadır
    }

    override fun onDestroy() {
        super.onDestroy()
        //Bu method kullanıcı ile bağlantısı kalmayan uygulamanın arkaplanı temizlemek için kullanılır.
    }
}