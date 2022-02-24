package com.example.study.oop.inheritance

import com.example.study.oop.encapsulation.User

class SuperUser(name: String, age: Int) : User(name, age) {

    fun sing(){
        println("nothing else matters")
    }
}