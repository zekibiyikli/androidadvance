package com.example.study.oop.abstract

open class User2(name: String, age: Int): People() {
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
