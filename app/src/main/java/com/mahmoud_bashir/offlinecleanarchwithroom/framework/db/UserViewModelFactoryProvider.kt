package com.mahmoud_bashir.offlinecleanarchwithroom.framework.db

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

object UserViewModelFactoryProvider : ViewModelProvider.Factory {

    lateinit var application: Application

    lateinit var dependencies: Interactors

    fun inject(application: Application, dependencies: Interactors) {
        this.application = application
        this.dependencies = dependencies
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(UserViewModel::class.java.isAssignableFrom(modelClass)) {
            return modelClass.getConstructor(Application::class.java, Interactors::class.java)
                .newInstance(
                    application,
                    dependencies)
        } else {
            throw IllegalStateException("ViewModel must extend MajesticViewModel")
        }
    }

}