package com.example.sampleapp.fragments

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.Adapter.LabelAdapter
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentLabelBinding
import com.example.sampleapp.model.labelModel

class LabelFragment : BaseFragment<FragmentLabelBinding>(R.layout.fragment_label) {

    override val binding by lazy { FragmentLabelBinding.inflate(layoutInflater) }

    private lateinit var adapter: LabelAdapter

    override fun onBackPressed() {
        TODO("Not yet implemented")
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
}
