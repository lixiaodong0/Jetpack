package com.lixd.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.login_fragment, container, false)
        return rootView
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args: LoginFragmentArgs by navArgs()
        et_phone.setText(args.phone)
        et_password.setText(args.password)

        btn_login.setOnClickListener {
            Navigation.findNavController(it).navigate(LoginFragmentDirections.actionLoginDestSelf())
        }
    }
}