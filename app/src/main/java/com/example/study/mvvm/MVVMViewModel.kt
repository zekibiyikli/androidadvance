package com.example.study.mvvm

import com.example.study.mvvm.base.BaseViewModel
import com.example.study.mvvm.interfaces.IMVVMNavigator

class MVVMViewModel: BaseViewModel<IMVVMNavigator>() {

    fun getResponse(){
        getNavigator().onResponse("deneme")
    }
}