package com.rrbofficial.mvvmcities

class CityDataProvider {

    private  val cities = arrayListOf<City>()
    init {

        cities.add(City(name = "Bankok", R.drawable.bangkok,10_00_00_000 ))
        cities.add(City(name = "Beijing", R.drawable.beijing, 21_500_000 ))
        cities.add(City(name = "London", R.drawable.london, 8_900_000 ))
        cities.add(City(name = "Newyork", R.drawable.newyork, 8_400_000 ))
        cities.add(City(name = "Paris", R.drawable.paris, 2_100_000 ))
        cities.add(City(name = "Rio de Janero", R.drawable.rio, 6_700_000 ))
        cities.add(City(name = "Rome", R.drawable.rome,2_800_000 ))
        cities.add(City(name = "Singapore", R.drawable.singapore, 5_700_000 ))
        cities.add(City(name = "Sydney", R.drawable.sydney, 5_300_000 ))
        cities.add(City(name = "Tokyo", R.drawable.tokyo, 13_9000_000))
    }

    fun getCities() = cities
}