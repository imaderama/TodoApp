package id.ac.ubaya.informatika.todoapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import id.ac.ubaya.informatika.todoapp.R

class MainActivity : AppCompatActivity() {
    private lateinit var navControllerC: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        //actionbar
//        val actionbar = supportActionBar
//        //set actionbar title
//        actionbar!!.title = "New Activity"
//        //set back button
//        actionbar.setDisplayHomeAsUpEnabled(true)
//
//        navControllerC = Navigation.findNavController(this, R.id.hostFragment)
//        NavigationUI.setupActionBarWithNavController(this, navControllerC)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navControllerC, null)
    }
}