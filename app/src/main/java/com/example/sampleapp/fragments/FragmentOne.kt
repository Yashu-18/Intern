package com.example.sampleapp.fragments

import android.os.Bundle
import android.view.View
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.MainActivity
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentOneBinding

class FragmentOne : BaseFragment<FragmentOneBinding>(R.layout.fragment_one) {

    override val binding by lazy { FragmentOneBinding.inflate(layoutInflater) }

    override fun onBackPressed() {
        if (parentFragmentManager.backStackEntryCount == 0) {
            activity?.finish()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.privacy.setOnClickListener {
//            (activity as MainActivity).loadFragment(FragmentTwo())
//        }
//
//        binding.insights.setOnClickListener {
//            (activity as MainActivity).loadFragment(InsightsFragment())
//        }
//
//        binding.cover.setOnClickListener {
//            (activity as MainActivity).loadFragment(CoverFragment())
//        }
//
//        binding.mediaType.setOnClickListener {
//            (activity as MainActivity).loadFragment(MediaFragment())
//        }
//
//        binding.inputType.setOnClickListener {
//            (activity as MainActivity).loadFragment(InputTypeFragment())
//        }
//
//        binding.connect.setOnClickListener {
//            (activity as MainActivity).loadFragment(ConnectDiaryFragment())
//        }
//
//        binding.highlights.setOnClickListener {
//            (activity as MainActivity).loadFragment(HubFragment())
//        }
    }
}
