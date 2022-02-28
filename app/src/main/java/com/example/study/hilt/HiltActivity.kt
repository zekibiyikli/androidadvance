package com.example.study.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.study.R
import com.example.study.hilt.example1.Musician
import com.example.study.hilt.example2.ClassExample
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltActivity : AppCompatActivity() {

    //Field Injection
    @Inject
    lateinit var lars: Musician
    @Inject
    lateinit var myClass: ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt)

        lars.sing()
        Log.e("Zeki",myClass.myFunction())
        Log.e("Zeki",myClass.secondFunction())

    }
}


/*
* Dependency injection frameworkü
* Dagger üzerine yapıldı
* initialize kısmını kendi yapıyor aslında
* Appte "@HiltAndroidApp" koyuldu
* field injection
* Constructor Injection
* scopelar için images-hilt_scopes resmine bak
* scopelarda yukarıdan aşağıya doğru inildikçe kapsam daralıyor vce eğer activityden çağırılıyorsa aşağısındaki scopelar kullanılamaz
* @Provides => basit ve tercih edilir
* @Binds => karmaşık ve abstract sınıflarda kullanılır
* */