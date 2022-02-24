package com.example.study.room.service

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.study.room.model.User

@Database(entities = arrayOf(User::class), version = 1)
abstract class UserDatabase :RoomDatabase(){

    abstract fun userDao():UserDao

    companion object{
        private var instance:UserDatabase?=null

        fun makeDatabase(context:Context):UserDatabase? {
            if (instance==null){
                instance=Room.databaseBuilder(context, UserDatabase::class.java, "userdatabase").allowMainThreadQueries().build()
            }
            return instance

        }
    }
}

    /*
    companion object{
        @Volatile private var instance:UserDatabase?=null

        private val lock=Any()
        operator fun invoke(context:Context)= instance?: synchronized(lock){
            instance ?: makeDatabase(context).also {
                instance=it
            }
        }

        private fun makeDatabase(context:Context)= Room.databaseBuilder(
            context.applicationContext,UserDatabase::class.java,"userdatabase"
        ).build()
    }
}*/

/*
* allowMainThreadQueries => kullanım amacı mainthreadde izin vermemesi normalde bunun yerine coroutine ile çağırılması lazım
* şimdilik test için bu kullanıldı
* @Volatione => farklı threadlerden erişilmesi için kullanılıyor
* synchronized => aynı anda firden fazla thread gelirse işlem yapılamıycak sadece bir threadde işlem yapılacak
* asynchronized => aynı anda birden fazla threadde çalışır
* */