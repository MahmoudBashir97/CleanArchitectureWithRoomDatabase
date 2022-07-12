package com.mahmoud_bashir.offlinecleanarchwithroom.framework.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [UserEntity::class],
    version = 1,
    exportSchema = false
)
abstract class UserDatabase:RoomDatabase(){

    abstract fun userDao():UserDao

    companion object {

        private const val DATABASE_NAME = "reader.db"

        private var instance: UserDatabase? = null

        private fun create(context: Context): UserDatabase =
            Room.databaseBuilder(context, UserDatabase::class.java, DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .build()


        fun getInstance(context: Context): UserDatabase =
            (instance ?: create(context)).also { instance = it }
    }
}