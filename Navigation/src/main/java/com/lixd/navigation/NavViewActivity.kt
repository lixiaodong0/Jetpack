package com.lixd.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

class NavViewActivity : AppCompatActivity() {


    private var appBarConfiguration: AppBarConfiguration? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * val navController = findNavController(R.id.my_nav_host_fragment)
         *  //绑定
         *   nav_view.setupWithNavController(navController)
         */
        setContentView(R.layout.drawer_nav_view_activity)
        val navView = findViewById<NavigationView>(R.id.nav_view)
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val navController = findNavController(R.id.my_nav_host_fragment)
        setSupportActionBar(toolbar)


//        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)
        appBarConfiguration = AppBarConfiguration(setOf(R.id.home_dest, R.id.settings_dest), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration!!)

        //1.绑定
        navView.setupWithNavController(navController)

        navController.navigate(R.id.settings_dest)
    }
    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.my_nav_host_fragment).navigateUp(appBarConfiguration!!)
    }
}