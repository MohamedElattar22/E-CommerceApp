package com.example.e_commerceapp.viewPagerAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commerceapp.R

class viewPagerAdapter(
    val images : List<Int>
) :RecyclerView.Adapter<viewPagerAdapter.ViewPagerViewHolder>() {
    inner class ViewPagerViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_viewpager, parent , false)
        view.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        return ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val currentImage = images[position]
        val img = holder.itemView.findViewById<ImageView>(R.id.imageHolder)
        img.setImageResource(currentImage)

    }

    override fun getItemCount(): Int {
        return images.size
    }
}