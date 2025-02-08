package com.example.sampleapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sampleapp.Adapter.LabelAdapter
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentLabelBinding
import com.example.sampleapp.model.labelModel


class LabelFragment : Fragment() {

    private var _binding: FragmentLabelBinding? = null
    private val binding get() = _binding!! // Safe access to binding

    private lateinit var adapter: LabelAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLabelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val labelItems = listOf(
            labelModel("Shoes", "4 posts", R.drawable.image, false),
            labelModel("Foods", "4 posts", R.drawable.image, false),
            labelModel("Cloths", "4 posts", R.drawable.image, false),
            labelModel("Mobile", "4 posts", R.drawable.image, true),
            labelModel("Cars", "4 posts", R.drawable.image, false)
        )

        adapter = LabelAdapter(labelItems)
        binding.recyclerView.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Prevent memory leaks
    }
}
