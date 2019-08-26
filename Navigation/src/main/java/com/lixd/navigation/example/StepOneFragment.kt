package com.lixd.navigation.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.lixd.navigation.BaseFragment
import com.lixd.navigation.R

class StepOneFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = layoutInflater.inflate(R.layout.step_one_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_next).setOnClickListener {
            findNavController().navigate(R.id.to_two_dest_action)
        }

    }
}