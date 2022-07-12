package com.mahmoud_bashir.offlinecleanarchwithroom.data

import com.mahmoud_bashir.offlinecleanarchwithroom.domain.User

interface UserDataSource {
    fun addNewUser(user: User)

    fun getAllUsers():List<User>

    fun removeUser(user: User)
}