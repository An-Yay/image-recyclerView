package com.example.recyclerviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewapp.R.layout.img_rec

class Imgadapter(var items: List<laytext>): RecyclerView.Adapter<Imgadapter.ItemViewHolder>() {

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Imgadapter.ItemViewHolder {


        val view = LayoutInflater.from(parent.context).inflate(img_rec,parent,false)

        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: Imgadapter.ItemViewHolder, position: Int) {
        holder.itemView.apply {
            text1.text = items[position].t1


            text2.text = items[position].t2



            text3.text = items[position].t3
            Glide.with(this)                .load(items[position].t4)                .into(glideImg)


        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}


