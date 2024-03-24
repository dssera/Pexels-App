package com.example.pexelsapp.images.data.maper

import android.net.http.HttpException
import com.example.pexelsapp.images.domain.model.ApiError
import com.example.pexelsapp.images.domain.model.NetworkError
import java.io.IOException

fun Throwable.toNetworkError(): NetworkError{
    val error = when(this) {
        is IOException -> ApiError.NetworkError
        is HttpException -> ApiError.UnknownResponse
        else -> ApiError.UnknownError
    }
    return NetworkError(
        error = error,
        t = this
    )
}