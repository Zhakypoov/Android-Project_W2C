package com.example.w2c.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.net.PasswordAuthentication

@Entity
data class User(
    @PrimaryKey val id: Int,
    val name: String,
    val surname:String,
    val number:Number,
    val password:String,
    val passwordAgain: String
)
