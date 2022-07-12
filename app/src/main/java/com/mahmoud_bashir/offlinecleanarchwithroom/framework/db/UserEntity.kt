package com.mahmoud_bashir.offlinecleanarchwithroom.framework.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_entity")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name:String,
    val age:Int
)
