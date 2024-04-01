package com.example.pexelsapp.images.data.remote

import arrow.core.Either
import com.example.pexelsapp.images.domain.model.Answer
import com.example.pexelsapp.images.domain.model.CuratedAnswer
import com.example.pexelsapp.images.domain.model.Image
import com.example.pexelsapp.images.domain.model.NetworkError
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface ImagesApi {

//   ?query=nature&per_page=1
    @GET("v1/search")
    suspend fun getImagesByQuery(
        @Header("Authorization") token: String,
        @Query("query") query: String,
        @Query("per_page") per_page: Int,
    ): Answer

    @GET("v1/curated")
    suspend fun getCuratedImages(
        @Header("Authorization") token: String,
        @Query("page") page: Int,
        @Query("per_page") per_page: Int,
    ): CuratedAnswer
}
