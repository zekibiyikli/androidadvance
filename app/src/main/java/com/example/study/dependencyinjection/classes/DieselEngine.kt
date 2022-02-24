package com.example.study.dependencyinjection.classes

import com.example.study.dependencyinjection.interfaces.IEngine

class DieselEngine: IEngine {
    override fun start():String {
        return "Diesel Engine Started!"
    }
}