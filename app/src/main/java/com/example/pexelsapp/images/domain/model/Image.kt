package com.example.pexelsapp.images.domain.model

data class Image(
    val id: Int,
    val width: Int,
    val height: Int,
    val author: String,
    val authorUrl: String,
    val authorId: Int,
    val avgColor: String,
    val src: String,
    val alt: String
)
