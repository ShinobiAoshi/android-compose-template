package com.pnet.composetemplate.ui.screen.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.pnet.composetemplate.data.models.Country
import androidx.compose.foundation.lazy.items

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    val uiState = viewModel.uiState

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        CountryList(countries = uiState.countries)
    }
}

@Composable
private fun CountryList(
    countries: List<Country>,
) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(countries) { country ->
            CountryItem(country)
        }
    }
}

@Composable
fun CountryItem(country: Country, modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(
            text = country.name.common,
            style = MaterialTheme.typography.h6,
        )

        Spacer(modifier = modifier.height(4.dp))

        Text(
            text = country.capital?.first() ?: "",
            style = MaterialTheme.typography.body1,
        )
    }
}
