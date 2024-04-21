package com.rrbofficial.mvvmcities.viewmodel

import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rrbofficial.mvvmcities.model.City
import com.rrbofficial.mvvmcities.model.CityDataProvider
import java.util.logging.Handler


// view model provides Live data that the UI can handle

class CityViewModel : ViewModel(){

    // we neeed a live data that we can change the value of
    private  val cityData = MutableLiveData<City>()
   private  val cities = CityDataProvider().getCities()
    private var currentIndex = 0
    private val delay = 2000L

    init {
        loop()
    }

    // so the view is going to connect to his city data, retrieve the data here and use it to update the UI
    fun getCityData(): LiveData<City> = cityData


    /*
   *  A handle ror looper are basically a way for us to loop through some class
   *
   *
   * */



    private fun loop()
    {
        /*
       *  When we call this loop function it simply going to call Handler with the main loop
       * which is basically going to call this block below after delay
       *
       * */
        android.os.Handler(Looper.getMainLooper()).postDelayed({
        updateCity()
        }, delay)
    }

    private fun updateCity()
    {
    currentIndex++
    currentIndex %= cities.size

     cityData.value = cities[currentIndex]


    loop()

    }

}