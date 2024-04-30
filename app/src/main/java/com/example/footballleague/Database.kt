package com.example.footballleague

import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase
@Database(entities = [Football::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getDao(): FootballDao
}