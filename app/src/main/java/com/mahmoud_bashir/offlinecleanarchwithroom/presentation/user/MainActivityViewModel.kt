package com.mahmoud_bashir.offlinecleanarchwithroom.presentation.user

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.mahmoud_bashir.offlinecleanarchwithroom.domain.User
import com.mahmoud_bashir.offlinecleanarchwithroom.framework.db.Interactors
import com.mahmoud_bashir.offlinecleanarchwithroom.framework.db.UserViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivityViewModel(application: Application,interactors: Interactors):UserViewModel(application,interactors) {

     var mlist:MutableLiveData<List<User>> = MutableLiveData()
     suspend fun insertUser(user:User)=interactors.addUser(user)

     @OptIn(DelicateCoroutinesApi::class)
     fun getAllUsers(){
        GlobalScope.launch {
            val m = interactors.getAllUsers
           mlist.postValue(m.invoke())
        }
    }
}