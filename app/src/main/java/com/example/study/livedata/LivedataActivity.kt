package com.example.study.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.study.R
import com.example.study.databinding.ActivityLivedataBinding
import com.example.study.databinding.ActivityMvvmBinding

class LivedataActivity : AppCompatActivity() {

    var list=MutableLiveData<List<String>>()
    var error=MutableLiveData<Boolean>()
    var loading=MutableLiveData<Boolean>()
    private lateinit var binding: ActivityLivedataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLivedataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        refreshData()
        observeLiveData()

        binding.btnList.setOnClickListener {
            list.value= arrayListOf("5","6","7")
        }
        binding.btnError.setOnClickListener {
            error.value=error.value!!.not()
        }
        binding.btnLoading.setOnClickListener {
            loading.value=loading.value!!.not()
        }
    }

    fun refreshData(){
        list.value= arrayListOf("1","2","3")
        error.value=false
        loading.value=false
    }

    fun observeLiveData(){
        list.observe(this, Observer {
            it?.let {
                showList(it)
            }
        })
        error.observe(this, Observer {
            it?.let {
                Log.e("Zeki-error",it.toString())
            }
        })
        loading.observe(this, Observer {
            it?.let {
                Log.e("Zeki-loading",it.toString())
            }
        })
    }

    fun showList(list:List<String>){
        list.let {
            for (item in list){
                Log.e("Zeki",item)
            }
        }
    }
}
