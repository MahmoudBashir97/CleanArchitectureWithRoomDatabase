package com.mahmoud_bashir.offlinecleanarchwithroom.framework.db

import android.app.Application
import com.mahmoud_bashir.offlinecleanarchwithroom.data.repo.UserRepository
import com.mahmoud_bashir.offlinecleanarchwithroom.interactors.AddUser
import com.mahmoud_bashir.offlinecleanarchwithroom.interactors.GetAllUsers
import com.mahmoud_bashir.offlinecleanarchwithroom.interactors.RemoveUser

class UserApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val userRepo = UserRepository(RoomUserDataSource(this))

        UserViewModelFactoryProvider.inject(
            this,
            Interactors(
                AddUser(userRepo),
                GetAllUsers(userRepo),
                RemoveUser(userRepo)
            )
        )
    }
}