package com.example.music_app.Adapter
/**
*
*Created by Sokheng :12/21/2020
* **/
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.music_app.Model.Feature
import com.example.music_app.R

class RandomAdapter(var list: List<Feature>) : RecyclerView.Adapter<RandomAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView = itemView.findViewById<ImageView>(R.id.imageViewdetails)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_menus, parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var itemimage = list[position]
        var image = holder.imageView
        Glide.with(image.context).load(itemimage.imageView).into(image)
    }
    override fun getItemCount(): Int {
        return list.size
    }
}
