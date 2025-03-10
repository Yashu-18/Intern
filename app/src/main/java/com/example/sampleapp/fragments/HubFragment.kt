package com.example.sampleapp.fragments

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.Adapter.ImageAdapter
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentHubBinding

class HubFragment : BaseFragment<FragmentHubBinding>(R.layout.fragment_hub) {

    override val binding by lazy { FragmentHubBinding.inflate(layoutInflater) }

    override fun onBackPressed() {
        // Handle back press if needed
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {

        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 3)


        val images = List(20) { R.drawable.mountain }


        binding.recyclerView.adapter = ImageAdapter(images)
    }
}
