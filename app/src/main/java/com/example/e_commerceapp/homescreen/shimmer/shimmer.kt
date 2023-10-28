package com.example.e_commerceapp.homescreen.shimmer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.e_commerceapp.databinding.HomeShimmerlAyoutBinding
import com.facebook.shimmer.Shimmer

class shimmer : Fragment() {
    lateinit var binding : HomeShimmerlAyoutBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = HomeShimmerlAyoutBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createShimmer()

    }
    fun createShimmer(){
        val shimmerFrameLayout = binding.homeSHIMMER
        val shimmer = Shimmer.AlphaHighlightBuilder()
            .setDuration(1500)
            .setBaseAlpha(0.7f)
            .setHighlightAlpha(1f)
            .setDirection(Shimmer.Direction.LEFT_TO_RIGHT)
            .setAutoStart(true)
            .build()

        shimmerFrameLayout.setShimmer(shimmer)
        shimmerFrameLayout.startShimmer()
    }

}