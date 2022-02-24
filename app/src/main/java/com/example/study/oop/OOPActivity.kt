package com.example.study.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.study.R
import com.example.study.oop.interfaces.Piano
import com.example.study.oop.encapsulation.User
import com.example.study.oop.inheritance.SuperUser
import com.example.study.oop.polymorphism.Dog
import com.example.study.oop.polymorphism.Mathematics

class OOPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oop)

        //encapsulation
        var user= User("name",12)
        println(user.name)

        //inheritance
        var lars= SuperUser("Lars",25)
        println(lars.name)

        //polymorphism
        //static
        var math= Mathematics()
        println(math.sum())
        println(math.sum(1,2))
        //dynamic
        var dog = Dog()
        println(dog.test())
        println(dog.sing())

        //abstract & interface
        //var myPeople= People() => abstract sınıflar tanımlanamaz
        var myPiano= Piano()
        myPiano.brand="Yamaha"
        myPiano.isDigital=false
        println(myPiano.roomName)
        myPiano.info()
    }
}


/*
* Abstraction => soyut sınıf oluşturulmaz ama implement edilirse çağırılabilir
* Encapsulation => modeldeki get ve set kullanımı aslında
* Inheritance => implement kullanımı aslında
* Polymorphism => static (aynı isim birden fazla kullanım) ve dynamic (aynı isimle override ile erişim)
* */