package com.example.study.oop.interfaces

class Piano : HouseDecor, Instrument {

    override var roomName: String
        get() = "Kitchen"
        set(value) {}

    var brand:String?=null
    var isDigital:Boolean?=null

}