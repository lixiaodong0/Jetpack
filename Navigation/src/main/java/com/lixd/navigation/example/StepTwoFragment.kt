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

class StepTwoFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = layoutInflater.inflate(R.layout.step_two_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_next).setOnClickListener {
            //跳转第三个页面
            findNavController().navigate(R.id.to_three_dest_action)
        }
        view.findViewById<Button>(R.id.btn_config_anim_to_next).setOnClickListener {
            /**
             * 构建动画参数
             * enterAnim 下一个页面的进入动画
             * exitAnim  上一个页面的退出动画
             * popExitAnim 下一个页面退出动画
             * popExitAnim 上一个页面进入动画
             */
            val navOptions = NavOptions.Builder()
                    .setEnterAnim(R.anim.slide_in_right)
                    .setPopExitAnim(R.anim.slide_out_right)
                    .setExitAnim(R.anim.slide_in_left)
                    .setPopEnterAnim(R.anim.slide_out_left)
                    .build()
            //带动画跳转第三个页面
            findNavController().navigate(R.id.to_three_dest_action, null, navOptions)
        }
        view.findViewById<Button>(R.id.btn_config_data_to_next).setOnClickListener {
            //携带数据跳转第三个页面
            val args = Bundle()
            args.putString("key", "测试")
            findNavController().navigate(R.id.to_three_dest_action, args)
        }
    }
}