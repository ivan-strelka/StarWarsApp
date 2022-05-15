package com.example.sw.api

import com.example.sw.models.*
import io.reactivex.Single
import retrofit2.Callback
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface ApiService {

    @GET("people")
    fun getAllPeople(): Single<SWModelList<Any?>>

    @GET("people/{id}")
    fun getPeople(@Path("id") peopleId: Int): Single<Person>

    @GET("films/{id}")
    fun getFilm(@Path("id") filmId: Int): Single<Films>

    @GET("/")
    fun getRootUrls(): Single<Root>

    @GET("films")
    fun getAllFilms(): Single<RootFilms>

    @GET("/starships")
    fun getAllStarships(
        @Query("page") page: Int,
        callback: Callback<SWModelList<Starship?>?>?
    )

    @GET("/starships/{id}/")
    fun getStarship(@Path("id") starshipId: Int): Single<Starship?>?

    @GET("/vehicles/")
    fun getAllVehicles(
        @Query("page") page: Int,
        callback: Callback<SWModelList<Vehicle?>?>?
    )

    @GET("/vehicles/{id}/")
    fun getVehicle(
        @Path("id") vehicleId: Int,
        callback: Callback<Vehicle?>?
    )

    @GET("/species/")
    fun getAllSpecies(
        @Query("page") page: Int,
        callback: Callback<SWModelList<Species?>?>?
    )

    @GET("/species/{id}/")
    fun getSpecies(
        @Path("id") speciesId: Int,
        callback: Callback<Species?>?
    )

    @GET("/planets/")
    fun getAllPlanets(
        @Query("page") page: Int,
        callback: Callback<SWModelList<Planet?>?>?
    )

    @GET("/planets/{id}/")
    fun getPlanet(
        @Path("id") planetId: Int,
        callback: Callback<Planet?>?
    )

}