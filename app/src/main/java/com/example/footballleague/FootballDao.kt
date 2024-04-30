package com.example.footballleague

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
@Dao
interface FootballDao {
    @Query("select * from football")
    suspend fun getAll(): List<Football>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(vararg products: Football)
}