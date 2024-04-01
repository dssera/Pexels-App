//package com.example.pexelsapp.images.view.adapter
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.DiffUtil
//import androidx.recyclerview.widget.ListAdapter
//import androidx.recyclerview.widget.RecyclerView
//import com.example.pexelsapp.R
//import com.example.pexelsapp.databinding
//import com.example.pexelsapp.images.domain.model.Image
//
//// read about adapters on this channel
//// https://www.youtube.com/watch?v=Bh3F4aWDRz0&list=PLmjT2NFTgg1cHUclGx5L9c92FG4pCN6lC&index=5&ab_channel=NecoRu
//class ImageAdapter: ListAdapter<Image, ImageAdapter.Holder>(Comparator()) {
//    class Holder(view: View): RecyclerView.ViewHolder(view) {
//        private val binding = List
//    }
//    class  Comparator: DiffUtil.ItemCallback<Image>() {
//        override fun areItemsTheSame(oldItem: Image, newItem: Image): Boolean {
//            return oldItem.id == newItem.id
//        }
//
//        override fun areContentsTheSame(oldItem: Image, newItem: Image): Boolean {
//            return oldItem == newItem
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
//        val view = LayoutInflater.from(parent.context)
//            .inflate(R.layout.activity_main, parent, false)
//        return Holder(view)
//    }
//
//    override fun onBindViewHolder(holder: Holder, position: Int) {
//
//    }
//}