package com.example.study.bottomnavigation.ui.bottomnavigation3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BottomNavigation3ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Bottom Navigation 3"
    }
    val text: LiveData<String> = _text
}