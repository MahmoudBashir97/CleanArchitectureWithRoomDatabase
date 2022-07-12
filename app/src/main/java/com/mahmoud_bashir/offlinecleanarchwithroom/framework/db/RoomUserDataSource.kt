package com.mahmoud_bashir.offlinecleanarchwithroom.framework.db

import android.content.Context
import com.mahmoud_bashir.offlinecleanarchwithroom.data.UserDataSource
import com.mahmoud_bashir.offlinecleanarchwithroom.domain.User

class RoomUserDataSource(context:Context):UserDataSource {

    private val dao = UserDatabase.getInstance(context).userDao()

    override fun addNewUser(user: User) = dao.insertUser(
        UserEntity(
        0,
        user.name,
        user.age
    )
    )

    override fun getAllUsers(): List<User>{
        var user:User?=null
        var mlist:ArrayList<User> = ArrayList()
        for(elem in dao.getAllUsers()){
            user = User(elem.id,elem.name,elem.age)
            mlist.add(user)
        }
        return mlist
    }


    override fun removeUser(user: User){
        val userEntity = UserEntity(user.id,user.name,user.age)
        dao.removeUser(userEntity)
    }
}