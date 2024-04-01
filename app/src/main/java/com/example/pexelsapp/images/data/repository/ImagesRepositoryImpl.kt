package com.example.pexelsapp.images.data.repository

import arrow.core.Either
import arrow.core.right
import com.example.pexelsapp.images.data.remote.ImagesApi
import com.example.pexelsapp.images.data.maper.toNetworkError
import com.example.pexelsapp.images.domain.model.Answer
import com.example.pexelsapp.images.domain.model.CuratedAnswer
import com.example.pexelsapp.images.domain.model.Image
import com.example.pexelsapp.images.domain.model.NetworkError
import com.example.pexelsapp.images.domain.repository.ImagesRepository

class ImagesRepositoryImpl constructor(
    private val imagesApi: ImagesApi
): ImagesRepository {
    override suspend fun getImagesByQuery(): Answer {
        return imagesApi.getImagesByQuery("7S4gkfhMoHYrK6ekprdT7HpYXbQGzohxtiYwrdUzoFh5jNEJU4gZxXrn",
            "nature",
            1)
    }

    // add Either<NetworkError, List<Image>>
    override suspend fun getCuratedImages(): CuratedAnswer {
        return imagesApi.getCuratedImages("7S4gkfhMoHYrK6ekprdT7HpYXbQGzohxtiYwrdUzoFh5jNEJU4gZxXrn",
            1,
            1)
    }
}