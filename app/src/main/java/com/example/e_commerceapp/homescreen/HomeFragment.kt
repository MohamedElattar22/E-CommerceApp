package com.example.e_commerceapp.homescreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.e_commerceapp.R
import com.example.e_commerceapp.categories.categoryFragment
import com.example.e_commerceapp.databinding.HomeCategoryFragmentBinding
import com.example.e_commerceapp.homescreen.recyclerAdapters.HomeCategoriesAdapter
import com.example.e_commerceapp.viewPagerAdapter.viewPagerAdapter
import com.facebook.shimmer.Shimmer


class HomeFragment : Fragment() {
    private lateinit var binding: HomeCategoryFragmentBinding
    private lateinit var viewModel: HomeFragmentViewModel
    val catAdapter = HomeCategoriesAdapter()
    val images = listOf(R.drawable.img_3 , R.drawable.img_4 , R.drawable.img_5)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = HomeCategoryFragmentBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = viewPagerAdapter(images)
        viewModel = ViewModelProvider(this)[HomeFragmentViewModel::class.java]
        binding.lifecycleOwner = this
        binding.vm=viewModel
        binding.viewPager.adapter=adapter
        binding.CategoriesRV.adapter = catAdapter
        viewModel.getCategory()
        createShimmer()
        subscribeToLiveData()








    }
    private fun subscribeToLiveData(){
        viewModel.isLoading.observe(viewLifecycleOwner){
            isloading->
            if(isloading == true){
                binding.homecontent.isVisible = false
                binding.homeSHIMMER.isVisible = true
            }
            else{
                binding.homecontent.isVisible = true
                binding.homeSHIMMER.isVisible = false
            }
        }
    }

    private fun createShimmer(){
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
    fun navigateToAllCategories(){
        binding.viewALLtv.setOnClickListener {
            navigateFragment()

        }
    }
    private fun navigateFragment() {
        parentFragmentManager
            .beginTransaction()
            .replace(R.id.MainFragment ,categoryFragment())
            .commit()
    }



}