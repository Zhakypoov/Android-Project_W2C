package com.example.w2c.data

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.net.PasswordAuthentication

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @NonNull
    @ColumnInfo(name = "city")
    val city: String,
    @NonNull
    @ColumnInfo(name = "number")
    val number: String,
    @NonNull
    @ColumnInfo(name = "password")
    val password: String,
    @NonNull
    @ColumnInfo(name = "passwordAgain")
    val passwordAgain: String
)


