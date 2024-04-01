package com.example.pexelsapp.images.domain.model

import androidx.compose.ui.graphics.drawscope.Stroke

//data class Image(
//    val id: Int,
//    val width: Int,
//    val height: Int,
//    val author: String,
//    val authorUrl: String,
//    val authorId: Int,
//    val avgColor: String,
//    val src: String,
//    val alt: String
//)
data class CuratedAnswer(
    val page: Int,
    val per_page: Int,
    val photos: List<Image>,
    val next_page: String,
)
data class Answer(
    val total_results: Int,
    val page: Int,
    val per_page: Int,
    val photos: List<Image>,
    val next_page: String,
)

data class Image(
    val id: Int,
    val width: Int,
    val height: Int,
    val url: String,
    val photographer: String,
    val photographer_url: String,
    val photographer_id: Int,
    val avg_color: String,
    val src: Source,
    val liked: Boolean,
    val alt: String
)

data class Source(
    val original: String,
    val large2x: String,
    val large: String,
    val medium: String,
    val small: String,
    val portrait: String,
    val landscape: String,
    val tiny: String,
)