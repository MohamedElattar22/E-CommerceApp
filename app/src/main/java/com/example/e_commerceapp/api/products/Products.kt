package com.example.e_commerceapp.api.products

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Products(
	val metadata: Metadata? = null,
	val data: List<DataItem?>? = null,
	val results: Int? = null
) : Parcelable