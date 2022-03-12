package com.example.study.navigationdrawer.ui.navigationdrawer2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NavigationDrawer2ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Drawer 2"
    }
    val text: LiveData<String> = _text
}