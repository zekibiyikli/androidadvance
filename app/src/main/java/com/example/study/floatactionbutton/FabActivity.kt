package com.example.study.floatactionbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.study.databinding.ActivityFabBinding

class FabActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFabBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFabBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init1()
        init2()
    }

    fun  init1(){
        binding.fab1.setOnClickListener {
            Log.e("Zeki","click fab1")
        }
    }

    fun init2(){
        binding.fab21.setOnClickListener {
            Log.e("Zeki","click fab21")
        }
        binding.fab22.setOnClickListener {
            Log.e("Zeki","click fab22")
        }
        binding.fab23.setOnClickListener {
            Log.e("Zeki","click fab23")
        }
    }
}