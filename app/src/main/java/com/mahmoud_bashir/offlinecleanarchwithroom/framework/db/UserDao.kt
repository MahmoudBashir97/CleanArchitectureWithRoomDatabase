package com.mahmoud_bashir.offlinecleanarchwithroom.framework.db

import androidx.room.*

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: UserEntity)
    @Query("SELECT * FROM user_entity order by id ASC")
    fun getAllUsers():List<UserEntity>
    @Delete
    fun removeUser(user: UserEntity)
}