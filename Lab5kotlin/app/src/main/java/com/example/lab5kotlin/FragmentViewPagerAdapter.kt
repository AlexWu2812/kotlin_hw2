package com.example.lab5kotlin

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentViewPagerAdapter  //初始化
    (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        return if (position == 0) {
            FirstFragment()
        } else if (position == 1) {
            SecondFragment()
        } else {
            ThirdFragment()
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}