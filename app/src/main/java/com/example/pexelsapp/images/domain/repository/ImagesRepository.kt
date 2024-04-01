package com.example.pexelsapp.images.domain.repository

import arrow.core.Either
import com.example.pexelsapp.images.domain.model.Answer
import com.example.pexelsapp.images.domain.model.CuratedAnswer
import com.example.pexelsapp.images.domain.model.Image
import com.example.pexelsapp.images.domain.model.NetworkError

interface ImagesRepository {
    // add Either<NetworkError, List<Image>>
    suspend fun getImagesByQuery(): Answer
    suspend fun getCuratedImages(): CuratedAnswer

}