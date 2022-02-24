package com.example.study.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.study.R
import com.example.study.dependencyinjection.classes.AutoCar
import com.example.study.dependencyinjection.classes.ElectricEngine

class DIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_di)

        init()
    }

    fun init(){
        var engine=ElectricEngine()
        var car=AutoCar(engine)
        car.drive()
    }
}