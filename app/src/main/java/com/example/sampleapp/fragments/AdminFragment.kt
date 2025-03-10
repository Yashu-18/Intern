package com.example.sampleapp.fragments

import android.os.Bundle
import android.view.View
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentAdminBinding
import com.example.sampleapp.Adapter.AccessAdapter
import com.example.sampleapp.model.accessModel

class AdminFragment : BaseFragment<FragmentAdminBinding>(R.layout.fragment_admin) {

    override val binding by lazy { FragmentAdminBinding.inflate(layoutInflater) }
    private lateinit var userAdapter: AccessAdapter

    override fun onBackPressed() {
        // Handle back press logic if needed
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val users = mutableListOf<accessModel>().apply {
            repeat(5) {
                add(accessModel(R.drawable.image1, "Alice", "Software Engineer"))
                add(accessModel(R.drawable.image1, "Bob", "UI/UX"))
                add(accessModel(R.drawable.image1, "Charlie", "Project Manager"))
            }
        }

        userAdapter = AccessAdapter(users, parentFragmentManager)
        binding.recyclerViewAdmin.apply {
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(requireContext())
            adapter = userAdapter
        }
    }
}
