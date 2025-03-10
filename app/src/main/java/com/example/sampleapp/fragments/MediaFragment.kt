package com.example.sampleapp.fragments

import android.os.Bundle
import android.view.View
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentMediaBinding

class MediaFragment : BaseFragment<FragmentMediaBinding>(R.layout.fragment_media) {

    override val binding by lazy { FragmentMediaBinding.inflate(layoutInflater) }

    override fun onBackPressed() {
        TODO("Not yet implemented")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Add any additional setup logic here if needed
    }
}
