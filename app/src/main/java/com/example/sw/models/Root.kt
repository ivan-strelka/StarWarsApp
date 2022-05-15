package com.example.sw.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Root(
    @Expose
    @SerializedName("films")
    val films: String? = null,
    @Expose
    @SerializedName("planets")
    val planets: String? = null,
    @Expose
    @SerializedName("species")
    val species: String? = null,
    @Expose
    @SerializedName("starships")
    val starships: String? = null,
    @Expose
    @SerializedName("vehicles")
    val vehicles: String? = null,
    @Expose
    @SerializedName("people")
    val people: String? = null
)
