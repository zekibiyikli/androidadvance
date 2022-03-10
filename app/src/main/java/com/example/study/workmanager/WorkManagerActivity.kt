package com.example.study.workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.work.*
import com.example.study.R
import java.util.concurrent.TimeUnit

class WorkManagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work_manager)

        //oneTime()
        periodictime()

    }

    fun oneTime(){
        val data=Data.Builder().putInt("intKey",1).build()

        val constraints=Constraints.Builder()
            //.setRequiredNetworkType(NetworkType.CONNECTED)//ağa bağlıysa dowork çalışacak
            .setRequiresCharging(false) // şarj edilmiyorsa çalışır
            .build()

        val myWorkRequest:WorkRequest= OneTimeWorkRequestBuilder<RefreshDatabase>()
            .setConstraints(constraints)
            .setInputData(data)
            //.setInitialDelay(5,TimeUnit.SECONDS)
            //.addTag("myTag")
            .build()

        WorkManager.getInstance(this).enqueue(myWorkRequest)

        //Chaining => sıralı çalıştırmak için - sadece onetimerequestte çalışır
        val myWorkRequest2:OneTimeWorkRequest= OneTimeWorkRequestBuilder<RefreshDatabase>()
            .setConstraints(constraints)
            .setInputData(data)
            .build()
        WorkManager.getInstance(this).beginWith(myWorkRequest2)
            .then(myWorkRequest2)
            .then(myWorkRequest2)
            .enqueue()
    }

    fun periodictime(){
        val data=Data.Builder().putInt("intKey",1).build()

        val constraints=Constraints.Builder()
            //.setRequiredNetworkType(NetworkType.CONNECTED)//ağa bağlıysa dowork çalışacak
            .setRequiresCharging(false) // şarj edilmiyorsa çalışır
            .build()

        val myWorkRequest:PeriodicWorkRequest= PeriodicWorkRequestBuilder<RefreshDatabase>(15,TimeUnit.MINUTES)//en az 15 dakika yap diyor android
            .setConstraints(constraints)
            .setInputData(data)
            .build()

        WorkManager.getInstance(this).enqueue(myWorkRequest)

        //STATE
        WorkManager.getInstance(this).getWorkInfoByIdLiveData(myWorkRequest.id).observe(this, Observer {
            when(it.state){
                WorkInfo.State.BLOCKED->Log.e("Zeki","BLOCKED")
                WorkInfo.State.CANCELLED->Log.e("Zeki","CANCELLED")
                WorkInfo.State.ENQUEUED->Log.e("Zeki","ENQUEUED")
                WorkInfo.State.FAILED->Log.e("Zeki","FAILED")
                WorkInfo.State.RUNNING->Log.e("Zeki","RUNNING")
                WorkInfo.State.SUCCEEDED->Log.e("Zeki","SUCCEEDED")
            }
        })
        //CANCEL
        //WorkManager.getInstance(this).cancelAllWork()// hepsini iptal eder
        //WorkManager.getInstance(this).cancelAllWorkByTag("Tag")// tage göre iptal eder
        //WorkManager.getInstance(this).cancelWorkById(myWorkRequest.id)// idye göre iptal eder
    }
}

/*
* Uygulama kapansa dahi çalışmasını sağlar
* inputData ile activityden gönderilen data workmanagerdan alınabilir
* OneTimeWorkRequest => 1 defa çalıştırır
* PeriodicWorkRequest => periodic olarak çalıştırır
* */