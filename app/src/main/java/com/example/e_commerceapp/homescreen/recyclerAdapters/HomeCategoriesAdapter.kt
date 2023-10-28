package com.example.e_commerceapp.homescreen.recyclerAdapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.e_commerceapp.api.categories.categoriesList
import com.example.e_commerceapp.databinding.CategoryitemBinding

class HomeCategoriesAdapter(var categorylist: List<categoriesList?>? = null) : RecyclerView.Adapter<HomeCategoriesAdapter.ViewHolder>() {
    class ViewHolder(val itemBinding : CategoryitemBinding):RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewBinding = CategoryitemBinding.inflate(
            LayoutInflater.from(parent.context)
            , parent , false)
        return ViewHolder(viewBinding)
    }

    override fun getItemCount(): Int {
       return categorylist?.size?:0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = categorylist!![position]
        holder.itemBinding.catTitle.text = category?.name
        Glide.with(holder.itemView)
            .load(category?.image)
            .centerCrop()
            .into(holder.itemBinding.catImg)
    }

    fun bindCategories(data: List<categoriesList?>?) {
        categorylist = data
        notifyDataSetChanged()

    }

}