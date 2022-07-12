package com.mahmoud_bashir.offlinecleanarchwithroom.framework.db

import com.mahmoud_bashir.offlinecleanarchwithroom.interactors.AddUser
import com.mahmoud_bashir.offlinecleanarchwithroom.interactors.GetAllUsers
import com.mahmoud_bashir.offlinecleanarchwithroom.interactors.RemoveUser

data class Interactors(
    val addUser:AddUser,
    val getAllUsers: GetAllUsers,
    val removeUser: RemoveUser
)