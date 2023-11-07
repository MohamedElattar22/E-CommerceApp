package com.example.e_commerceapp.api

import kotlinx.coroutines.flow.merge
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiManager {
        companion object {
            private var retrofit: Retrofit? = null
            private fun getInstance(): Retrofit {
                if (retrofit == null) {
                    retrofit = Retrofit.Builder()
                        .baseUrl("https://ecommerce.routemisr.com/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                }
                return retrofit!!
            }

            fun getApis(): WebService {
                return getInstance().create(WebService::class.java)
            }
        }

}