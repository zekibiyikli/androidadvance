package com.example.study.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.study.R
import com.example.study.room.model.User
import com.example.study.room.service.UserDatabase

class RoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        storeInRoom()
    }

    fun storeInRoom(){
        var list= arrayListOf<User>(
            User(name = "1", age = 1),
            User(name = "2", age = 2),
            User(name = "3", age = 3),
            User(name = "4", age = 4),
        )

        val dao=UserDatabase.makeDatabase(this)!!.userDao()
        dao. deleteAllCountries()
        dao.insertAll(*list.toTypedArray()) // list => individual
        var resultList=dao.getAllUsers()
        showUser(resultList)
    }

    fun showUser(list:List<User>){
        for (item in list){
            Log.e("Zeki","${item.name.toString()} => ${item.id.toString()}")
        }
    }
}