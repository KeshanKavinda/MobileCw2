package com.example.footballleague

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Football (
    @PrimaryKey(autoGenerate = true) var id: Int= 0,
    var name: String?,
    var price: Int
)