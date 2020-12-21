package com.example.music_app.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.music_app.Model.Recently
import com.example.music_app.R

class DetailsProductsAdapter(var itemDetails: List<Recently>):RecyclerView.Adapter<DetailsProductsAdapter.ViewHolder>() {
    class ViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
     val imageView=itemView.findViewById<ImageView>(R.id.imageView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_detailproducts,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val detailProducts =itemDetails[position]
        val image =holder.imageView
        Glide.with(image.context).load(detailProducts.image).into(image)
    }
    override fun getItemCount(): Int {
       return itemDetails.size
    }
}
