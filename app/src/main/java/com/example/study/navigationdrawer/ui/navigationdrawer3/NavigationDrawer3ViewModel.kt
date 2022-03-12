package com.example.study.navigationdrawer.ui.navigationdrawer3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NavigationDrawer3ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Drawer 3"
    }
    val text: LiveData<String> = _text
}