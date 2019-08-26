package com.lixd.navigation.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.lixd.navigation.BaseFragment
import com.lixd.navigation.R

class StepThreeFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = layoutInflater.inflate(R.layout.step_three_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_open_default_mode).setOnClickListener {
            //用默认的模式打开自己
            findNavController().navigate(R.id.to_three_dest_action)
        }
        view.findViewById<Button>(R.id.btn_open_top_mode).setOnClickListener {
            //用栈顶模式打开自己
            val navOptions = NavOptions.Builder().setLaunchSingleTop(true).build()
            findNavController().navigate(R.id.to_three_dest_action, null, navOptions)
        }
        view.findViewById<Button>(R.id.btn_back_stop_one).setOnClickListener {
            //回到第一个页面
            findNavController().navigate(R.id.to_one_dest_action)
        }
    }
}