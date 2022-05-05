package com.pnet.composetemplate.data.repo

import com.pnet.composetemplate.data.service.CountriesService

class CountriesRepository(private val countriesService: CountriesService) {
    suspend fun getCountries() = countriesService.getAllCountries()
}
