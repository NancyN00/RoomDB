package com.example.roomdb.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User (
//primarykey means RD will automatically generate the numbers for our column.
    @PrimaryKey(autoGenerate = true)
         val id : Int,
         val firstname : String,
         val lastname : String,
         val age : Int
        )
