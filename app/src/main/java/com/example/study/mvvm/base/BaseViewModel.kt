package com.example.study.mvvm.base

import androidx.lifecycle.ViewModel
import java.lang.ref.WeakReference

abstract class BaseViewModel<N>(): ViewModel() {
    lateinit var navigator: WeakReference<N>

    fun getNavigator():N{
        return navigator.get()!!
    }

    fun setNavigator(navigator:N){
        this.navigator=WeakReference(navigator)
    }
}