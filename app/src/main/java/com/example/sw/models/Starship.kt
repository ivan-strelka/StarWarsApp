package com.example.sw.models

import com.google.gson.annotations.SerializedName

data class Starship(
    @SerializedName("starship_class")
    var starshipClass: String? = null,

    @SerializedName("hyperdrive_rating")
    var hyperdriveRating: String? = null,

    @SerializedName("MGLT")
    var mglt: String? = null

)


