package com.example.recyclerview.model

import com.example.pexelsapp.images.domain.model.Image
import java.util.Collections

typealias ImagesListener = (users: List<Image>) -> Unit
class ImagesService {

    private var images = mutableListOf<Image>()

    private val listeners = mutableSetOf<ImagesListener>()

    init {
        // TODO LOGIC WITH RETROFIT
    }

    fun getImages(): List<Image> {
        return images
    }
    fun addListener(listener: ImagesListener) {
        listeners.add(listener)
        listener.invoke(images)
    }
    fun removeListener(listener: ImagesListener) {
        listeners.remove(listener)
    }
    private fun notifyChanges() {
        listeners.forEach {it.invoke(images)}
    }

}