package com.example.pexelsapp.images.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pexelsapp.R
import com.example.pexelsapp.databinding.ItemImgBinding
import com.example.pexelsapp.images.domain.model.Image

interface ImagesActionsListener {
    fun onImageDetails(image: Image)
}

class ImagesAdapter(
    private val actionsListener: ImagesActionsListener
): RecyclerView.Adapter<ImagesAdapter.ImagesViewHolder>(), View.OnClickListener {

    var images: List<Image> = emptyList()
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }

    override fun onClick(v: View) {
        // tag это данные которые мы хотим ассоциировать с вью элементом
        val image = v.tag as Image
        actionsListener.onImageDetails(image)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemImgBinding.inflate(inflater, parent, false)

        binding.root.setOnClickListener(this)

        return ImagesViewHolder(binding)
    }

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ImagesViewHolder, position: Int) {
        val image: Image = images[position]
        with(holder.binding){
            holder.itemView.tag = image
            if (image.src.medium != ""){
                Glide.with(photoImageView)
                    .load(image.src.medium)
                    .circleCrop()
                    .placeholder(R.drawable.blank_img)
                    .error(R.drawable.blank_img)
                    .into(photoImageView)
            } else {
                photoImageView.setImageResource(R.drawable.blank_img)
            }
        }
    }
    class ImagesViewHolder(
        val binding: ItemImgBinding
    ) : RecyclerView.ViewHolder(binding.root)
}
