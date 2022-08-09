package com.example.study.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.study.R

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val tax=Tax()
        val netIncome=tax.calculateIncome(100.0,0.1)
        val netTax=tax.calculateTax(100.0,0.1)

        println(netIncome)
        println(netTax)
    }
}