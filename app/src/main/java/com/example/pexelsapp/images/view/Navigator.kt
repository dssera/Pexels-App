package com.example.pexelsapp.images.view

import android.media.Image

interface Navigator  {

    fun showDetails(image: Image)
    fun goBack()
    fun toast(messageRes: Int)
}