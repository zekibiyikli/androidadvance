package com.example.study.coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.study.R
import com.example.study.mvvm.MVVMViewModel

class CoroutineActivity : AppCompatActivity() {

    private lateinit var viewModel: CoroutineViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CoroutineViewModel::class.java)
        setContentView(R.layout.activity_coroutine)

        viewModel.startCoroutine()
    }
}