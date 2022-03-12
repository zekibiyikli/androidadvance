package com.example.study.navigationdrawer.ui.navigationdrawer1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NavigationDrawer1ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Drawer 1"
    }
    val text: LiveData<String> = _text
}