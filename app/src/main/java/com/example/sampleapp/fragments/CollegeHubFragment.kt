package com.example.sampleapp.fragments

import android.os.Bundle
import android.view.View
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentCollegeHubBinding
import com.example.sampleapp.Adapter.CollegeHubAdapter
import androidx.recyclerview.widget.LinearLayoutManager

class CollegeHubFragment : BaseFragment<FragmentCollegeHubBinding>(R.layout.fragment_college_hub) {

    override val binding by lazy { FragmentCollegeHubBinding.inflate(layoutInflater) }

    override fun onBackPressed() {
        // Handle back press logic if needed
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView1.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        // Sample data
        val imageList = listOf(R.drawable.rectangle, R.drawable.rectangle, R.drawable.rectangle)

        // Set adapter
        binding.recyclerView1.adapter = CollegeHubAdapter(imageList)
    }
}
