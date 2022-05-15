package com.example.sw.models

import androidx.room.Entity
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "full_one_person")
data class Person(
    @SerializedName("name")
    @Expose
    private var name: String? = null,

    @SerializedName("height")
    @Expose
    private var height: String? = null,

    @SerializedName("mass")
    @Expose
    private var mass: String? = null,

    @SerializedName("hair_color")
    @Expose
    private var hairColor: String? = null,

    @SerializedName("skin_color")
    @Expose
    private var skinColor: String? = null,

    @SerializedName("eye_color")
    @Expose
    private var eyeColor: String? = null,

    @SerializedName("birth_year")
    @Expose
    private var birthYear: String? = null,

    @SerializedName("gender")
    @Expose
    private var gender: String? = null,

    @SerializedName("homeworld")
    @Expose
    private var homeworld: String? = null,

    @SerializedName("films")
    @Expose
    private var films: List<String?>? = null,

    @SerializedName("vehicles")
    @Expose
    private var vehicles: List<String?>? = null,

    @SerializedName("starships")
    @Expose
    private var starships: List<String?>? = null,

    @SerializedName("created")
    @Expose
    private var created: String? = null,

    @SerializedName("edited")
    @Expose
    private var edited: String? = null,

    @SerializedName("url")
    @Expose
    private var url: String? = null

)