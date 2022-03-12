package com.example.study.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.study.viewpager.ui.viewpager1.ViewPager1Fragment
import com.example.study.viewpager.ui.viewpager2.ViewPager2Fragment
import com.example.study.viewpager.ui.viewpager3.ViewPager3Fragment

class PageAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3;
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return ViewPager1Fragment()
            }
            1 -> {
                return ViewPager2Fragment()
            }
            2 -> {
                return ViewPager3Fragment()
            }
            else -> {
                return ViewPager1Fragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "Tab 1"
            }
            1 -> {
                return "Tab 2"
            }
            2 -> {
                return "Tab 3"
            }
        }
        return super.getPageTitle(position)
    }

}
