package com.example.study.dependencyinjection.classes

import android.util.Log
import com.example.study.dependencyinjection.interfaces.ICar
import com.example.study.dependencyinjection.interfaces.IEngine

class AutoCar: ICar {

    var engine: IEngine

    constructor(engine: IEngine){
        this.engine=engine
    }

    override fun drive() {
        var engineStart=engine.start()
        Log.e("Zeki",engineStart)
    }
}