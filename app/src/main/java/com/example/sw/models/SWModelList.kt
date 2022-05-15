package com.example.sw.models

import androidx.room.Entity
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

@Entity(tableName = "all_people_list")
data class SWModelList<T>(
    @SerializedName("count")
    @Expose
    private val count: Int? = null,

    @SerializedName("next")
    @Expose
    private val next: String? = null,

    @SerializedName("previous")
    @Expose
    private val previous: Any? = null,

    @SerializedName("results")
    @Expose
    private val results: List<Person>? = null,
)