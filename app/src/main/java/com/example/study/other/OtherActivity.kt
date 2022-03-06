package com.example.study.other

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable
import com.bumptech.glide.Glide
import com.example.study.R
import com.example.study.databinding.ActivityLivedataBinding
import com.example.study.databinding.ActivityOtherBinding
import com.squareup.picasso.Picasso

class OtherActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOtherBinding
    var imageUrl="https://i.pinimg.com/736x/d1/9e/64/d19e643478d30bd2dd039b363c8634cd.jpg"
    lateinit var btnLottie:LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtherBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_other)

        btnLottie=findViewById(R.id.btnLottie)

        initGlide()
        initPicasso()
        initLottie()
    }

    fun initGlide(){
        Glide.with(this)
            .load(imageUrl)
            .centerCrop()
            .into(binding.imgGLide)
    }
    fun initPicasso(){
        Picasso.get()
            .load(imageUrl)
            .resize(100,100)
            .rotate(90F)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(binding.imgPicasso)
    }
    fun initLottie(){
        btnLottie.setAnimation("buynow.json")
        btnLottie.setOnClickListener {
            btnLottie.setMinProgress(0.2f)
            btnLottie.setMaxProgress(0.5f)
            btnLottie.repeatCount = LottieDrawable.INFINITE
            btnLottie.playAnimation()

            Handler().postDelayed({
                btnLottie.repeatCount = 1
                btnLottie.setMaxProgress(1.0f)

            }, 3000)
        }
    }
}