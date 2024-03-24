package com.example.pexelsapp.images.domain.repository

import arrow.core.Either
import com.example.pexelsapp.images.domain.model.Image
import com.example.pexelsapp.images.domain.model.NetworkError

interface ImagesRepository {
    // add Either<NetworkError, List<Image>>
    suspend fun getImages(): List<Image>

}