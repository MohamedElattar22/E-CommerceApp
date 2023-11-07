package com.example.e_commerceapp.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.e_commerceapp.databinding.DetailCategoryFragmentBinding


class categoryFragment : Fragment() {
    lateinit var binding: DetailCategoryFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DetailCategoryFragmentBinding.inflate(inflater , container , false)
        return binding.root
    }
}