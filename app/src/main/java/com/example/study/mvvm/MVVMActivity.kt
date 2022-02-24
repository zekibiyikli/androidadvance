package com.example.study.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.study.databinding.ActivityMvvmBinding
import com.example.study.mvvm.interfaces.IMVVMNavigator

class MVVMActivity : AppCompatActivity(), IMVVMNavigator {

    private lateinit var binding: ActivityMvvmBinding
    private lateinit var viewModel: MVVMViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MVVMViewModel::class.java)
        binding = ActivityMvvmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.setNavigator(this)

        viewModel.getResponse()
    }

    override fun onResponse(response: String) {
        Log.e("Zeki",response)
    }
}