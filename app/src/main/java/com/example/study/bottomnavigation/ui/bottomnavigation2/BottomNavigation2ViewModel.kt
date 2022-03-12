package com.example.study.bottomnavigation.ui.bottomnavigation2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BottomNavigation2ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Bottom Navigation 2"
    }
    val text: LiveData<String> = _text
}