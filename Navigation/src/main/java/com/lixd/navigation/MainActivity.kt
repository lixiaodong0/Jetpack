package com.lixd.navigation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
/**
 * Navigation官方使用教程
 * https://codelabs.developers.google.com/codelabs/android-navigation/#8
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val toolbar = supportActionBar
        toolbar!!.title = ""
    }
}
