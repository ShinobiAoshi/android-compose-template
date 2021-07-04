package com.theapache64.composeandroidtemplate.ui.screen.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.theapache64.composeandroidtemplate.R
import com.theapache64.composeandroidtemplate.ui.theme.ComposeAndroidTemplateTheme

@Composable
fun DashboardScreen(
    viewModel: DashboardViewModel = hiltViewModel()
) {

    val greetings by viewModel.greetings.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Greetings
        Text(
            text = greetings,
            style = MaterialTheme.typography.h3
        )

        Spacer(modifier = Modifier.height(30.dp))

        // Action : Click Me
        Button(onClick = {
            viewModel.onClickMeClicked()
        }) {
            Text(text = stringResource(id = R.string.action_click_me))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {
    ComposeAndroidTemplateTheme {
        Text(text = "Something")
    }
}