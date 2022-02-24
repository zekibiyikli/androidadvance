package com.example.study.retrofitrxjava.service

import com.example.study.retrofitrxjava.model.Country
import io.reactivex.Single
import retrofit2.http.GET

interface CountryAPI {
    //GET - POST

    @GET("countrydataset.json")
    fun getCountries(): Single<List<Country>>
}

/*
* Single => sadece bir defa bu işlemi yapar ve durur
* Observable => veri devamlı bir şekilde işlem yapar
* */