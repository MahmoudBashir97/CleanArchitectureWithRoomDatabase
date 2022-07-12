package com.mahmoud_bashir.offlinecleanarchwithroom.data.repo

import com.mahmoud_bashir.offlinecleanarchwithroom.data.UserDataSource
import com.mahmoud_bashir.offlinecleanarchwithroom.domain.User

class UserRepository(private val dataSource: UserDataSource) {

    suspend fun insertNewUser(user: User) = dataSource.addNewUser(user)

    suspend fun getAllUsers() = dataSource.getAllUsers()

    suspend fun deleteUser(user: User) = dataSource.removeUser(user)
}