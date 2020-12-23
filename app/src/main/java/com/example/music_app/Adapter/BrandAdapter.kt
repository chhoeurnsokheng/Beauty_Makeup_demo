package com.example.music_app.Adapter

/**
 *Created by Sokheng :12/21/2020
 * **/
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.music_app.Model.Brand
import com.example.music_app.R

class BrandAdapter(val itemlist: List<Brand>) : RecyclerView.Adapter<BrandAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.brandimage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_brand, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val itembrand = itemlist[position]
        holder.image.setImageResource(itembrand.imageView)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }
}
