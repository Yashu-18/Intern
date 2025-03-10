package com.example.sampleapp.fragments

import android.os.Bundle
import android.view.View
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentInsightsBinding

class InsightsFragment : BaseFragment<FragmentInsightsBinding>(R.layout.fragment_insights) {

    override val binding by lazy { FragmentInsightsBinding.inflate(layoutInflater) }

    override fun onBackPressed() {
        TODO("Not yet implemented")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Add any additional logic if needed
    }
}