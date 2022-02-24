package com.example.study.oop.encapsulation

open class User(name: String, age: Int) {
    //Encapsulation
    var name:String?= name
        private set
        get

    private var age:Int?= age
    private val region="Turkey"

    init {
        println("user initialized")
    }

}
