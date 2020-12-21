package com.example.music_app.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.music_app.Model.Productsname
import com.example.music_app.R

class ProductNameAdapter(var products:List<Productsname>):RecyclerView.Adapter<ProductNameAdapter.MyViewHolder>() {
    class MyViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
        val name=itemView.findViewById<TextView>(R.id.nameProducts)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_productname,parent,false))
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val itemProducts =products[position]
        holder.name.text=itemProducts.name
    }
    override fun getItemCount(): Int {
       return products.size
    }

}
