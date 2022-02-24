package com.example.study.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.study.databinding.listener.ClickListener
import com.example.study.databinding.model.Model

class DataBindingActivity : AppCompatActivity(),ClickListener {

    private lateinit var binding: ActivityDatabindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDatabindingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var model= Model(1,"title Model","https://pbs.twimg.com/media/EUVBxzRXkAElBR-.jpg")
        binding.model=model
        binding.title="title Base"
        binding.listener=this

    }

    override fun onClicked(v: View) {
        var id= binding.modelId.text.toString().toInt()
        Log.e("Zeki",id.toString())
    }
}


/*
* 1 => Layout tag i altında olmalı
* 2 => Databindingde click sorun olduğu için ayrı interface oluşturup çağırdık
* */