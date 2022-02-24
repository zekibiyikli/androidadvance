package com.example.study.extensions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.study.R
import com.example.study.databinding.ActivityDatabindingBinding
import com.example.study.databinding.ActivityExtensionsBinding
import com.example.study.extensions.utils.loadImage

class ExtensionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExtensionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExtensionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgBase.loadImage("https://pbs.twimg.com/media/EUVBxzRXkAElBR-.jpg")
    }
}