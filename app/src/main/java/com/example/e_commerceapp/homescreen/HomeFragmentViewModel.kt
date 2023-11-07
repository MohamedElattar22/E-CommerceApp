package com.example.e_commerceapp.homescreen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.e_commerceapp.api.ApiManager
import com.example.e_commerceapp.api.categories.Categories
import com.example.e_commerceapp.homescreen.recyclerAdapters.HomeCategoriesAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragmentViewModel : ViewModel() {
    val isLoading  = MutableLiveData<Boolean>()
    val catAdapter = HomeCategoriesAdapter()

    fun getCategory(){
        isLoading.postValue(true)
        ApiManager
            .getApis()
            .getAllCategories()
            .enqueue(object : Callback<Categories> {
                override fun onResponse(call: Call<Categories>, response: Response<Categories>) {
                    if(response.isSuccessful){
                        isLoading.postValue(false)

                        catAdapter.bindCategories(response.body()?.data)
                    }
                }

                override fun onFailure(call: Call<Categories>, t: Throwable) {
                    isLoading.postValue(true)
                }

            })
    }

}