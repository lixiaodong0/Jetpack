package com.lixd.navigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.home_fragment, container, false)
        return rootView
    }

    private val loginOptions = NavOptions.Builder()
            .setEnterAnim(R.anim.slide_in_right)
            .setExitAnim(R.anim.slide_out_left)
            .setPopEnterAnim(R.anim.slide_in_left)
            .setPopExitAnim(R.anim.slide_out_right)
            .build()


    private val registerOptions = NavOptions.Builder()
            .setPopUpTo(R.id.home_dest, false)
            .build()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnLoginDest.setOnClickListener {
            val args = Bundle()
            args.putString("phone", "18665888764")
            args.putString("password", "123456")


            Navigation.findNavController(it).navigate(R.id.login_dest, args, loginOptions)
        }
        /*btnRegisterDest.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.register_dest)
        )*/

        btnRegisterDest.setOnClickListener {

            //            Navigation.findNavController(it).navigate(R.id.register_dest, null, registerOptions)\
            val nextAction = HomeFragmentDirections.nextActionRegisterDest()
            Navigation.findNavController(it).navigate(nextAction)
        }
    }
}