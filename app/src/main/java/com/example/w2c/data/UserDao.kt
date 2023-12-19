package com.example.w2c.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface UserDao {
    @Query(
        "SELECT * FROM users"
    )
    fun getAll(): Flow<List<User>>

    @Insert
    fun insertUser(item: User)


}