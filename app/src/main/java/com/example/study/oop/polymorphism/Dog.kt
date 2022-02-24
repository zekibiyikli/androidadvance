package com.example.study.oop.polymorphism

class Dog: Animal() {

    fun test(){
        super.sing() // super implement edilen sınıfı çağırır
    }

    override fun sing(){
        println("Dog sing")
    }
}