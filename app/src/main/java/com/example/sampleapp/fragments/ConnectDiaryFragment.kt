package com.example.sampleapp.fragments

import android.os.Bundle
import android.view.View
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentConnectDiaryBinding

class ConnectDiaryFragment : BaseFragment<FragmentConnectDiaryBinding>(R.layout.fragment_connect_diary) {

    override val binding by lazy { FragmentConnectDiaryBinding.inflate(layoutInflater) }

    override fun onBackPressed() {
        // Handle back press logic if needed
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}