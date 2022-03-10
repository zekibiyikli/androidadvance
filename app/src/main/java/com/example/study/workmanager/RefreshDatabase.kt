package com.example.study.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class RefreshDatabase(val context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {

    override fun doWork(): Result {
        val getData=inputData
        val myNumber=getData.getInt("intKey",0)
        refreshDatabase(myNumber)
        return Result.success()
    }

    private fun refreshDatabase(myNumber:Int){
        val sharedPreferences=context.getSharedPreferences("com.example.study",Context.MODE_PRIVATE)
        var mySavedNumber=sharedPreferences.getInt("myNumber",0)
        mySavedNumber += myNumber
        Log.e("Zeki",mySavedNumber.toString())
        sharedPreferences.edit().putInt("myNumber",mySavedNumber).apply()
    }
}