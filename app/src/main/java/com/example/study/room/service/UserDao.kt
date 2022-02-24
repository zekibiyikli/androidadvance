package com.example.study.room.service

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.study.room.model.User

@Dao
interface UserDao {

    @Insert
    fun insertAll(vararg users: User):List<Long>

    @Query("SELECT * FROM user")
    fun getAllUsers():List<User>

    @Query("SELECT * FROM user WHERE id=:id")
    fun getUser(id:Int):User

    @Query("DELETE FROM user")
    fun deleteAllCountries()
}



/*
* suspend => coroutine de kullanılır durudulur ve devam eddirilir
* varargs => sayısı belli olmayan tekil objeyi göndermek için multiple user object
* List<Long> => primary keys
* */