package com.example.w2c.data

import android.icu.text.CaseMap.Title
import android.media.Image
import android.media.MediaDescription
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.net.Inet4Address

@Entity(tableName = "apartments")
data class Apartments(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "price")
    val price: Int,
    @ColumnInfo(name = "address")
    val address: String,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "description")
    val description: String
)