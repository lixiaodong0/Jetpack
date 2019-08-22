package com.lixd.navigation

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SettingsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val textview = TextView(container?.context)
        textview.text = "设置页面"
        textview.textSize = 30f
        textview.setTextColor(Color.RED)
        return textview
    }
}