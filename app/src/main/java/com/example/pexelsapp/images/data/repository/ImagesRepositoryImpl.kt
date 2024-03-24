package com.example.pexelsapp.images.data.repository

import arrow.core.Either
import arrow.core.right
import com.example.pexelsapp.images.data.remote.ImagesApi
import com.example.pexelsapp.images.data.maper.toNetworkError
import com.example.pexelsapp.images.domain.model.Image
import com.example.pexelsapp.images.domain.model.NetworkError
import com.example.pexelsapp.images.domain.repository.ImagesRepository

class ImagesRepositoryImpl constructor(
    private val imagesApi: ImagesApi
): ImagesRepository {
    // add Either<NetworkError, List<Image>>
    override suspend fun getImages(): List<Image> {
        return imagesApi.getImages()
    }
}