package com.rrbofficial.mvvmcities.view

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import com.rrbofficial.mvvmcities.R
import com.rrbofficial.mvvmcities.databinding.ActivityMainBinding
import com.rrbofficial.mvvmcities.model.City
import com.rrbofficial.mvvmcities.viewmodel.CityViewModel

class MainActivity : AppCompatActivity() {

    private val model: CityViewModel by viewModels()
    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

       model.getCityData().observe(this, Observer { city ->

           binding.cityImage.setImageDrawable(
               ResourcesCompat.getDrawable(resources, city.img, applicationContext.theme)
           )

           binding.cityNameTV.text = city.name
           binding.cityPopulationTV.text = city.population.toString()
       })
    }
}