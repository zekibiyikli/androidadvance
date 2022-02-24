package com.example.study.kotpref.model

import com.chibatching.kotpref.KotprefModel
import java.util.*

object UserInfo : KotprefModel() {
    var name by stringPref()
    var code by nullableStringPref()
    var age by intPref(default = 14)
    var highScore by longPref()
    var rate by floatPref()
    val prizes by stringSetPref {
        val set = TreeSet<String>()
        set.add("Beginner")
        return@stringSetPref set
    }
}
