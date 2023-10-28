package com.example.e_commerceapp.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.e_commerceapp.databinding.HomeCategoryFragmentBinding
import com.example.e_commerceapp.databinding.ProfileFragmentBinding

class profileFragment : Fragment() {
    lateinit var binding: ProfileFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ProfileFragmentBinding.inflate(inflater , container , false)
        return binding.root
    }
}