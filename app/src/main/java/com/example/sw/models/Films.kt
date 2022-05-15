package com.example.sw.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


@Entity(tableName = "one_film")
data class Films(
    @Expose
    @SerializedName("edited")
    val edited: String? = null,

    @Expose
    @SerializedName("director")
    val director: String? = null,

    @Expose
    @SerializedName("created")
    val created: String? = null,
    @Expose
    @SerializedName("vehicles")
    val vehicles: List<String> = listOf(),

    @Expose
    @SerializedName("opening_crawl")
    val openingCrawl: String? = null,

    @Expose
    @PrimaryKey
    @SerializedName("title")
    val title: String = "",

    @Expose
    @SerializedName("url")
    val url: String? = null,
    @Expose
    @SerializedName("characters")
    val characters: List<String?>? = null,
    @Expose
    @SerializedName("episode_id")
    val episodeId: Int? = null,
    @Expose
    @SerializedName("planets")
    val planets: List<String?>? = null,
    @Expose
    @SerializedName("release_date")
    val releaseDate: String? = null,
    @Expose
    @SerializedName("starships")
    val starships: List<String?>? = null,
    @Expose
    @SerializedName("species")
    val species: List<String?>? = null,
    @Expose
    @SerializedName("producer")
    val producer: String? = null
)
