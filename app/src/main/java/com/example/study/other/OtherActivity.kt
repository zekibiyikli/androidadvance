package com.example.study.other

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.study.R
import com.example.study.databinding.ActivityLivedataBinding
import com.example.study.databinding.ActivityOtherBinding

class OtherActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOtherBinding
    var imageUrl="https://i.pinimg.com/736x/d1/9e/64/d19e643478d30bd2dd039b363c8634cd.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtherBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_other)

        initGlide()
    }

    fun initGlide(){
        Glide.with(this)
            .load(imageUrl)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(binding.imgGLide)
    }
}