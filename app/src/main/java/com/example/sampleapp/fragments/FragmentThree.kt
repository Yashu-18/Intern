package com.example.sampleapp.fragments

import android.os.Bundle
import android.view.View
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.MainActivity
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentThreeBinding

class FragmentThree : BaseFragment<FragmentThreeBinding>(R.layout.fragment_three) {

    override val binding by lazy { FragmentThreeBinding.inflate(layoutInflater) }

    override fun onBackPressed() {
        TODO("Not yet implemented")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.crewbtn.setOnClickListener {
//            (activity as MainActivity).loadFragment(CrewMemberFragment())
//        }
//
//        binding.groupbtn.setOnClickListener {
//            (activity as MainActivity).loadFragment(GroupFragment())
//        }
//
//        binding.custombtn.setOnClickListener {
//            (activity as MainActivity).loadFragment(AccessFragment())
//        }
    }
}
