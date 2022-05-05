package com.pnet.composetemplate.ui.screen.home

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pnet.composetemplate.R
import com.pnet.composetemplate.data.models.Country
import com.pnet.composetemplate.data.repo.CountriesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val countriesRepository: CountriesRepository) : ViewModel() {
    var uiState by mutableStateOf(HomeUiState())
        private set

    init {
        loadCountries()
    }

    private fun loadCountries() {
        viewModelScope.launch {
            val countries = countriesRepository.getCountries()
            when (countries.isSuccessful) {
                true -> {
                    with(countries.body().orEmpty()) {
                        uiState = uiState.copy(countries = this)
                    }
                }
                else -> {
                    Log.e("HomeViewModel", countries.message())
                }
            }
        }
    }
}

data class HomeUiState(
    val countries: List<Country> = emptyList(),
    val loading: Boolean = false
)
