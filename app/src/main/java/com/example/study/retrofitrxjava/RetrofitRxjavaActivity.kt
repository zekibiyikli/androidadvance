package com.example.study.retrofitrxjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.study.R
import com.example.study.retrofitrxjava.model.Country
import com.example.study.retrofitrxjava.service.CountryAPI
import com.example.study.retrofitrxjava.service.CountryAPIService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class RetrofitRxjavaActivity : AppCompatActivity() {

    private val countryApiService=CountryAPIService()
    private val disposable=CompositeDisposable()//Kullan at objesi
    val countries= MutableLiveData<List<Country>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit_rxjava)

        checkList()
        data()
    }

    fun data(){
        disposable.add(
            countryApiService.getClient().getCountries()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object:DisposableSingleObserver<List<Country>>(){
                    override fun onSuccess(t: List<Country>) {
                        Log.e("Zeki","Success")
                        countries.value=t
                    }

                    override fun onError(e: Throwable) {
                        Log.e("Zeki","Error")

                    }
                })
        )
    }

    fun checkList(){
        countries.observe(this, Observer {
            it?.let {
                for (item in it){
                    Log.e("Zeki",item.name.toString())
                }
            }
        })
    }
}