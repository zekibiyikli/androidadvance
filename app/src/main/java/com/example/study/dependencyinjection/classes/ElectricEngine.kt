package com.example.study.dependencyinjection.classes

import com.example.study.dependencyinjection.interfaces.IEngine

class ElectricEngine: IEngine {
    override fun start(): String {
        return "Electric Engine Started!"
    }
}