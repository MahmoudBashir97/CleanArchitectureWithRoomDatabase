package com.mahmoud_bashir.offlinecleanarchwithroom.interactors

import com.mahmoud_bashir.offlinecleanarchwithroom.data.repo.UserRepository

class GetAllUsers(private val repo:UserRepository) {

    suspend operator fun invoke() = repo.getAllUsers()
}