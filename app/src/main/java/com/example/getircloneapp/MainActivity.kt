package com.example.getircloneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
//import com.example.getircloneapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(getirToolBar)
        val navHost =supportFragmentManager.findFragmentById(R.id.fragmentNav) as NavHostFragment
        NavigationUI.setupWithNavController(bottomNavigationView,navHost.navController)
    }
}