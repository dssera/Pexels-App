package com.example.pexelsapp.images.data.remote

import arrow.core.Either
import com.example.pexelsapp.images.domain.model.Image
import com.example.pexelsapp.images.domain.model.NetworkError
import retrofit2.http.GET

interface ImagesApi {

    @GET("/search?query=nature&per_page=1")
    suspend fun getImages(): List<Image>
}
