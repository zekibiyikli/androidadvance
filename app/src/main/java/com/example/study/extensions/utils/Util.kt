package com.example.study.extensions.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.study.R

fun ImageView.loadImage(url:String){
    Glide.with(context)
        .load(url)
        .placeholder(R.drawable.ic_launcher_background)
        .error(R.mipmap.ic_launcher_round)
        .into(this)
}