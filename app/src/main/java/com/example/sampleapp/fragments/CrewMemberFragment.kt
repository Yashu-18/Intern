package com.example.sampleapp.fragments

import android.os.Bundle
import android.view.View
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentCrewMemberBinding

class CrewMemberFragment : BaseFragment<FragmentCrewMemberBinding>(R.layout.fragment_crew_member) {

    override val binding by lazy { FragmentCrewMemberBinding.inflate(layoutInflater) }

    override fun onBackPressed() {
        // Handle back press logic if needed
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}