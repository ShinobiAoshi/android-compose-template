package com.pnet.composetemplate.data.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Country(
    val name: Name,
    val capital: List<String>? = null,
)

@JsonClass(generateAdapter = true)
data class Name (
    val common: String
)
