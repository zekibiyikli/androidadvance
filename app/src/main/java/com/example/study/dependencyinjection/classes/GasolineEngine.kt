package com.example.study.dependencyinjection.classes

import com.example.study.dependencyinjection.interfaces.IEngine

class GasolineEngine: IEngine {
    override fun start(): String {
        return "Gasoline Engine Started!"
    }
}