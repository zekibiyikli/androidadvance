package com.example.study.flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.example.study.R
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlin.coroutines.CoroutineContext

class FlowActivity : AppCompatActivity() {

    val viewModel:FlowViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow)

        //test1()
        //viewModel.collectInViewModel()
        //viewModel.collectInViewModel2()
        //viewModel.collectInViewModel3()
        //viewModel.collectInViewModel4()
        //viewModel.collectInViewModel5()
        //testState()
        testShared()
    }

    fun test1(){
        runBlocking {
            viewModel.countDownTimerFlow.collect {
                Log.e("Zeki1",it.toString())
            }
        }
    }

    fun testState(){
        runBlocking {
            viewModel.changeStateFlowValue()
            viewModel.stateFlow.collect {
                Log.e("Zeki",it)
            }
        }
    }

    fun testShared(){
        runBlocking{
            viewModel.changeSharedFlowValue()
            viewModel.sharedFlow.collect {
                Log.e("Zeki",it)
            }
        }

    }

}

/*
* livedata yerine kullanılıyor,
* coroutineler içerisinde yer alıyor
* birden fazla değer döndürülebiliyor
* emit => dağıtır
* collect => toplar
* */