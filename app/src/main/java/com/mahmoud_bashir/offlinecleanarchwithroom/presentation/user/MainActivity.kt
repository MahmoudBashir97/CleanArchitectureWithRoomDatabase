package com.mahmoud_bashir.offlinecleanarchwithroom.presentation.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.mahmoud_bashir.offlinecleanarchwithroom.R
import com.mahmoud_bashir.offlinecleanarchwithroom.framework.db.UserViewModelFactoryProvider

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doInitialize()

       doEvents()
    }

    private fun doEvents() {

        //todo here us used it to insert data to room database

    /* GlobalScope.launch {
             val user : User = User(0,"mahmoud",25)
             viewModel.insertUser(user)
         }*/

        //todo here for getting all inserted data with observing by using MutableLiveData
        viewModel.getAllUsers()

        viewModel.mlist.observe(this) { mlist ->
            if (mlist != null) {
                Log.d("MM","")
                Toast.makeText(this@MainActivity, "success : : : ${mlist[0]}", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun doInitialize() {
        viewModel = ViewModelProviders.of(this,UserViewModelFactoryProvider)
            .get(MainActivityViewModel::class.java)
    }


}