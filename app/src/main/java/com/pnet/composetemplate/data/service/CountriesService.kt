package com.pnet.composetemplate.data.service

import com.pnet.composetemplate.data.models.Country
import retrofit2.Response
import retrofit2.http.GET

interface CountriesService {
    @GET("all")
    suspend fun getAllCountries(): Response<List<Country>>
}
