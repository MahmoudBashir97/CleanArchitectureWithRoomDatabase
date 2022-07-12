package com.mahmoud_bashir.offlinecleanarchwithroom.framework.db

import android.app.Application
import androidx.lifecycle.AndroidViewModel

open class UserViewModel(application: Application, protected val interactors: Interactors)
    :AndroidViewModel(application){

        protected val application:UserApplication = getApplication()
}