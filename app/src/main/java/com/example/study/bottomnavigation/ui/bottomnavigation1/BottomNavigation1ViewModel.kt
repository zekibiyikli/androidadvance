package com.example.study.bottomnavigation.ui.bottomnavigation1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BottomNavigation1ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Bottom Navigation 1"
    }
    val text: LiveData<String> = _text
}