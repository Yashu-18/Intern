package com.example.sampleapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sampleapp.Adapter.AccessAdapter
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentAdminBinding
import com.example.sampleapp.model.accessModel


class AdminFragment : Fragment() {

    private var _binding: FragmentAdminBinding? = null
    private val binding get() = _binding!!
    private lateinit var userAdapter: AccessAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAdminBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val users = mutableListOf<accessModel>()

        for(i in 1..5){
            users.add(
                accessModel(R.drawable.image1,"Alice","Software Engineer")
            )
            users.add(
                accessModel(R.drawable.image1,"Bob","UI/UX")
            )
            users.add(
                accessModel(R.drawable.image1,"Charlie","Project Manager")
            )
        }

        userAdapter = AccessAdapter(users,parentFragmentManager)
        binding.recyclerViewAdmin.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewAdmin.adapter = userAdapter

    }


}