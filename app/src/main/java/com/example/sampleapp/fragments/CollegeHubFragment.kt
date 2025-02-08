package com.example.sampleapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sampleapp.Adapter.CollegeHubAdapter
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentCollegeHubBinding

class CollegeHubFragment : Fragment() {

    private var _binding: FragmentCollegeHubBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCollegeHubBinding.inflate(inflater, container, false)

        binding.recyclerView1.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)


        // Sample data
        val imageList = listOf(R.drawable.rectangle, R.drawable.rectangle, R.drawable.rectangle)

        // Set adapter
        binding.recyclerView1.adapter = CollegeHubAdapter(imageList)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}