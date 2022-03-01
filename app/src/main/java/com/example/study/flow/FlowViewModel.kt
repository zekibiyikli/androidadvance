package com.example.study.flow

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class FlowViewModel:ViewModel() {

    val countDownTimerFlow= flow<Int> {
        val countDownFrom=10
        var counter=countDownFrom
        emit(countDownFrom)
        while (counter>0){
            delay(1000)
            counter--
            emit(counter)
        }
    }

    fun collectInViewModel(){
        viewModelScope.launch {
            countDownTimerFlow.collect {
                Log.e("Zeki2",it.toString())
            }
        }
    }

    fun collectInViewModel2(){
        viewModelScope.launch {
            countDownTimerFlow
                .filter {
                    it%3==0
                }
                .collect {
                Log.e("Zeki3",it.toString())
            }
        }
    }
    fun collectInViewModel3(){
        viewModelScope.launch {
            countDownTimerFlow
                .map {
                    it+it
                }
                .collect {
                    Log.e("Zeki4",it.toString())
                }
        }
    }

    fun collectInViewModel4(){
        countDownTimerFlow.onEach {
            Log.e("Zeki5",it.toString())
        }.launchIn(viewModelScope)
    }

    fun collectInViewModel5(){
        viewModelScope.launch {
            countDownTimerFlow.collectLatest {
                Log.e("Zeki6",it.toString())
            }
        }
    }

    private val _stateFlow= MutableStateFlow("kotlinStateFlow")
    val stateFlow=_stateFlow.asStateFlow()

    private val _sharedFlow= MutableSharedFlow<String>()
    val sharedFlow=_sharedFlow.asSharedFlow()

    fun changeStateFlowValue(){
        _stateFlow.value="State Flow"
    }

    fun changeSharedFlowValue(){
        viewModelScope.launch {
            _sharedFlow.emit("Shared Flow")
        }
    }

    /*
    * stateflow => Flowun biraz daha objeleştirilmiş hali flow gibi
    * sharedflow => custom edilebilir olduğu için kullanılıyuor genelde custom yapılmayacaksa kullanmak gereksiz
    * */


}