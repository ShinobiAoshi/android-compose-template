package com.pnet.composetemplate.ui.screen

sealed class Screen(val route: String) {
    object Home : Screen("home")
}