package com.example.study.kotpref

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.chibatching.kotpref.Kotpref
import com.chibatching.kotpref.bulk
import com.example.study.R
import com.example.study.kotpref.model.UserInfo

class KotprefActivity : AppCompatActivity() {

    private var TAG="KotPref"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotpref)

        Kotpref.init(this)

        init1()
        init2()

    }

    fun init1(){
        UserInfo.name = "chibatching"
        UserInfo.code = "DAEF2599-7FC9-49C5-9A11-3C12B14A6898"
        UserInfo.age = 30
        UserInfo.highScore = 49219902
        UserInfo.rate = 49.21F
        UserInfo.prizes.add("Bronze")
        UserInfo.prizes.add("Silver")
        UserInfo.prizes.add("Gold")

        writeLog()
    }

    fun init2(){
        UserInfo.bulk {
            name = "chibatching Jr"
            code = "451B65F6-EF95-4C2C-AE76-D34535F51B3B"
            age = 2
            highScore = 3901
            rate = 0.4F
            prizes.clear()
            prizes.add("New Born")
        }

        writeLog()
    }

    fun writeLog(){
        Log.d(TAG, "User name: ${UserInfo.name}")
        Log.d(TAG, "User code: ${UserInfo.code}")
        Log.d(TAG, "User age: ${UserInfo.age}")
        Log.d(TAG, "User high score: ${UserInfo.highScore}")
        Log.d(TAG, "User rate: ${UserInfo.rate}")
        UserInfo.prizes.forEachIndexed { i, s -> Log.d(TAG, "prize[$i]: $s") }
    }
}