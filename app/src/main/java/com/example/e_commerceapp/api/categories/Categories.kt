package com.example.e_commerceapp.api.categories

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class Categories(

	@field:SerializedName("metadata")
	val metadata: Metadata? = null,

	@field:SerializedName("data")
	val data: List<categoriesList?>? = null,

	@field:SerializedName("results")
	val results: Int? = null
) : Parcelable