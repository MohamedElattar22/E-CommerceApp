package com.example.e_commerceapp.api.categories

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class Metadata(

	@field:SerializedName("numberOfPages")
	val numberOfPages: Int? = null,

	@field:SerializedName("limit")
	val limit: Int? = null,

	@field:SerializedName("currentPage")
	val currentPage: Int? = null
) : Parcelable