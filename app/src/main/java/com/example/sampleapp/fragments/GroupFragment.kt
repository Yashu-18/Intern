package com.example.sampleapp.fragments

import android.os.Bundle
import android.view.View
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentGroupBinding

class GroupFragment : BaseFragment<FragmentGroupBinding>(R.layout.fragment_group) {

    override val binding by lazy { FragmentGroupBinding.inflate(layoutInflater) }

    override fun onBackPressed() {
        TODO("Not yet implemented")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Add any additional logic if needed
    }
}
