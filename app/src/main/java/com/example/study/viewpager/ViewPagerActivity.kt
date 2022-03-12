package com.example.study.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.study.databinding.ActivityViewPagerBinding
import com.example.study.viewpager.adapter.PageAdapter

class ViewPagerActivity : AppCompatActivity() {

    lateinit var binding: ActivityViewPagerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityViewPagerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init1()
    }

    fun init1(){
        binding.viewPager.adapter = PageAdapter(supportFragmentManager)
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }

}