package com.roy.hobby_yun.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.roy.hobby_yun.fragments.AllMembersFragment
import com.roy.hobby_yun.fragments.HistoryFragment
import com.roy.hobby_yun.fragments.RemarksFragment
import com.roy.hobby_yun.fragments.SongsFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "BTS"
            1 -> "활동내역"
            2 -> "대표곡"
            else -> "참고사이트"

        }

    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> AllMembersFragment()
            1 -> HistoryFragment()
            2 -> SongsFragment()
            else -> RemarksFragment()


        }
    }

    override fun getCount(): Int {
        return 4
    }
}