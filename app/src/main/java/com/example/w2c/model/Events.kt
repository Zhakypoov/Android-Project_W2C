package com.example.w2c.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable

data class Events(
    val title: String,
    val description:String,
    val time: String,
    val location: String,
    @SerialName("img_src") val imgSrc: String
)
