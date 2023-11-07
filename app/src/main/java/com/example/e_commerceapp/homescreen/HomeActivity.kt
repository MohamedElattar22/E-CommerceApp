package com.example.e_commerceapp.homescreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.e_commerceapp.R
import com.example.e_commerceapp.categories.categoryFragment
import com.example.e_commerceapp.databinding.ActivityHomeBinding
import com.example.e_commerceapp.favourites.favouritesFragment
import com.example.e_commerceapp.profile.profileFragment

class HomeActivity : AppCompatActivity() {
    lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navigateFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener { item->
           if(item.itemId == R.id.Home){

               navigateFragment(HomeFragment())

           }
            else if(item.itemId == R.id.Categories){
                navigateFragment(categoryFragment())
           }
           else if(item.itemId == R.id.favourite){
               navigateFragment(favouritesFragment())
           }
           else if(item.itemId == R.id.profile){
               navigateFragment(profileFragment())
           }

            return@setOnItemSelectedListener true
        }

    }

    private fun navigateFragment(fragment : Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.MainFragment , fragment)
            .commit()
    }

}