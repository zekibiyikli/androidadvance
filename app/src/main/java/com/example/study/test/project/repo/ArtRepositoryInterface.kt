package com.example.study.test.project.repo

import androidx.lifecycle.LiveData
import com.example.study.test.project.model.ImageResponse
import com.example.study.test.project.roomdb.Art
import com.example.study.test.project.util.Resource
import retrofit2.Response

interface ArtRepositoryInterface {

    suspend fun insertArt(art : Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString : String) : Resource<ImageResponse>

}