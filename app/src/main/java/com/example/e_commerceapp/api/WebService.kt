package com.example.e_commerceapp.api

import com.example.e_commerceapp.api.categories.Categories
import retrofit2.Call
import retrofit2.http.GET

interface WebService {
    @GET("api/v1/categories")
    fun getAllCategories():Call<Categories>
}