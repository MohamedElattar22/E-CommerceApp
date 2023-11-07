package com.example.e_commerceapp.favourites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.e_commerceapp.databinding.FavouritesFragmentBinding
import com.example.e_commerceapp.databinding.HomeCategoryFragmentBinding

class favouritesFragment : Fragment() {
    lateinit var binding: FavouritesFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FavouritesFragmentBinding.inflate(inflater , container , false)
        return binding.root
    }
}