package com.example.study.hilt.example2

import javax.inject.Inject

class SecondInterfaceImplementor @Inject constructor(): MyInterface {
    override fun myPrintFunction(): String {
        return "My Second Interface Implementor"
    }

}