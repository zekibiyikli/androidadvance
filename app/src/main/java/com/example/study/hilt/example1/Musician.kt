package com.example.study.hilt.example1

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class Musician
    //Constructor Injection
    @Inject
    constructor(instrument: Instrument, band: Band){

    fun sing(){
      Log.e("Zeki","Sing")
    }
}