package com.example.study.coroutine

import android.app.Application
import android.util.Log
import kotlinx.coroutines.launch

class CoroutineViewModel(application: Application):BaseViewModel(application) {

    fun startCoroutine(){
        launch {
            Log.e("Zeki","Coroutine Thread")
        }
    }
}