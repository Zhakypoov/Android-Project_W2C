package com.example.w2c.data

import android.media.Image
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Apartments(
    @PrimaryKey val id: Int,
    val title: String,
    val description:String,
    val price:Int,
    val address:String,
    val image:Image
)