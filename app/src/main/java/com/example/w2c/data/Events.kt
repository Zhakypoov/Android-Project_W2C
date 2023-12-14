package com.example.w2c.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Entity
data class Events(
   @PrimaryKey val id: Int,
    val title: String,
    val description:String,
    val time: String,
    val location: String,
    @SerialName("img_src") val imgSrc: String
)
