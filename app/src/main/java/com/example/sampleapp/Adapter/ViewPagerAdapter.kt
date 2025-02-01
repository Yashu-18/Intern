package com.example.sampleapp.Adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.sampleapp.MainActivity
import com.example.sampleapp.fragments.FragmentOne
import com.example.sampleapp.fragments.FragmentTwo

class ViewPagerAdapter(mainActivity: MainActivity) : FragmentStateAdapter(mainActivity){

    private val fragmentCout = 2
    override fun getItemCount(): Int {
        return fragmentCout
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0->{
                return FragmentOne()
            }
            1->{
                return FragmentTwo()
            }
        }
        return FragmentOne()
    }
}