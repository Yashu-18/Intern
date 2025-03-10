package com.example.sampleapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentAboutPostBinding
import com.example.sampleapp.databinding.FragmentHighlightsBinding


class AboutPostFragment : BaseFragment<FragmentAboutPostBinding>(R.layout.fragment_about_post) {

    override val binding by lazy { FragmentAboutPostBinding.inflate(layoutInflater) }


    override fun onBackPressed() {
        TODO("Not yet implemented")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


}