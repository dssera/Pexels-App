package com.example.pexelsapp.images.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pexelsapp.images.domain.model.Image
import com.example.recyclerview.model.ImagesService

class ImagesListViewModel(
    private val imagesService: ImagesService
): ViewModel() {

    private val _users = MutableLiveData<List<Image>>()
    val users: LiveData<List<Image>> = _users
    fun loadImages() {

    }

}