package com.example.study.compose.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.study.compose.model.CryptoList
import com.example.study.compose.repository.CryptoRepository
import com.example.study.compose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CryptoListViewModel @Inject constructor(private val repository:CryptoRepository):ViewModel() {

    var cryptoList= mutableStateOf<List<CryptoList>>(listOf())
    var errorMessage= mutableStateOf("")
    var isLoading= mutableStateOf(false)
    private var initialCryptoList= listOf<CryptoList>()
    private var isSearch=true

    init {
        loadCryptos()
    }

    fun searchCryptos(query:String){
        val listToSearch=if (isSearch){
            cryptoList.value
        }else{
            initialCryptoList
        }

        viewModelScope.launch(Dispatchers.Default) {
            if (query.isEmpty()){
                cryptoList.value=initialCryptoList
                isSearch=true
                return@launch
            }

            val results=listToSearch.filter {
                it.currency.contains(query.trim(),ignoreCase = true)
            }

            if (isSearch){
                initialCryptoList=cryptoList.value
                isSearch=false
            }

            cryptoList.value=results

        }
    }

    fun loadCryptos(){
        viewModelScope.launch {
            isLoading.value=true
            val result=repository.getCryptoList()
            when(result){
                is Resource.Success->{
                    val cryptoItems=result.data as List<CryptoList>
                    cryptoList.value=cryptoItems
                    isLoading.value=false
                }
                is Resource.Error->{
                    errorMessage.value=result.message!!
                    isLoading.value=false
                }
            }
        }
    }
}