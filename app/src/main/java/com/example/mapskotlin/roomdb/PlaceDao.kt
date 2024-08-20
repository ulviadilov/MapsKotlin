package com.example.mapskotlin.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Index
import androidx.room.Insert
import androidx.room.Query
import com.example.mapskotlin.model.Place
import io.reactivex.rxjava3.core.Completable

@Dao
interface PlaceDao {
    @Query("SELECT * FROM Place WHERE id = ")
    fun getAll() : List<Place>
    @Insert
    fun insert (place : Place) : Completable
    @Delete
    fun delete (place : Place)
}