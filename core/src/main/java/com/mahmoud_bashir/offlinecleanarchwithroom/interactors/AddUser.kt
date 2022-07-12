package com.mahmoud_bashir.offlinecleanarchwithroom.interactors

import com.mahmoud_bashir.offlinecleanarchwithroom.data.repo.UserRepository
import com.mahmoud_bashir.offlinecleanarchwithroom.domain.User

class AddUser(private val repo:UserRepository) {

    suspend operator fun invoke(user: User) = repo.insertNewUser(user)
}