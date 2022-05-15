package com.example.sw.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.sw.models.Films
import com.example.sw.models.Person
import com.example.sw.models.SWModelList


@Dao
interface PersonDao {

    @Query("SELECT * FROM one_film")
    fun getOneFilm():LiveData<Films>

    @Query("SELECT * FROM all_people_list")
    fun getRootAllPeopleInfo(): LiveData<SWModelList<Any?>>

    @Query("SELECT * FROM full_one_person")
    fun getAllPeopleInfo(): LiveData<List<Person>>

    @Query("SELECT * FROM full_one_person WHERE name == :name LIMIT 1")
    fun getSinglePeopleInfo(name: String): LiveData<Person>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPeopleList(peopleList: List<Person>)

}