package com.example.pexelsapp.images.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pexelsapp.R
import com.example.pexelsapp.databinding.FragmentImagesListBinding
import com.example.pexelsapp.images.domain.model.Image
import com.example.pexelsapp.images.view.adapter.ImagesActionsListener
import com.example.pexelsapp.images.view.adapter.ImagesAdapter

class ImagesListFragment : Fragment() {

    private lateinit var binding: FragmentImagesListBinding // association between class and layout
    private lateinit var adapter: ImagesAdapter // TODO

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentImagesListBinding.inflate(inflater, container, false)
        adapter = ImagesAdapter(
            object : ImagesActionsListener {
                override fun onImageDetails(image: Image) {
                    TODO("Not yet implemented")
                }
            }
        )
        val layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter


        return inflater.inflate(R.layout.fragment_images_list, container, false)
    }
}