package com.example.study.compose.viewmodel

import androidx.lifecycle.ViewModel
import com.example.study.compose.model.Crypto
import com.example.study.compose.repository.CryptoRepository
import com.example.study.compose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(private val repository: CryptoRepository): ViewModel() {

    suspend fun getCrypto(id:String):Resource<List<Crypto>>{
        return repository.getCrypto(id)
    }
}