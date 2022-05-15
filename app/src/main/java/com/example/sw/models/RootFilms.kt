package com.example.sw.models
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RootFilms(
	@Expose
	@SerializedName("next")
	val next: Any? = null,
	@Expose
	@SerializedName("previous")
	val previous: Any? = null,
	@Expose
	@SerializedName("count")
	val count: Int? = null,
	@Expose
	@SerializedName("results")
	val results: List<Films?>? = null
)

