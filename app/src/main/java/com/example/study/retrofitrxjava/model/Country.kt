package com.example.study.retrofitrxjava.model

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("name")
    val name:String?,
    @SerializedName("region")
    val region:String?,
    @SerializedName("capital")
    val capital:String?,
    @SerializedName("currency")
    val currency:String?,
    @SerializedName("language")
    val language:String?,
    @SerializedName("flag")
    val flag:String?,
)