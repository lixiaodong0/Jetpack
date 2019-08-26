package com.lixd.navigation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.lixd.navigation.example.NavDemoActivity

/**
 * Navigation官方使用教程
 * https://codelabs.developers.google.com/codelabs/android-navigation/#8
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.btn_to_navigation).setOnClickListener {
            startActivity(Intent(MainActivity@ this, NavDemoActivity::class.java))
        }

        findViewById<Button>(R.id.btn_to_navigation_ui).setOnClickListener {

        }

        findViewById<Button>(R.id.btn_to_deep_link).setOnClickListener {

        }
    }

}
