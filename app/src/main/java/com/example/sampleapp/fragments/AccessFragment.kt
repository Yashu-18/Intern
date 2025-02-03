package com.example.sampleapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sampleapp.Adapter.AccessAdapter
import com.example.sampleapp.MainActivity
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentAccessBinding
import com.example.sampleapp.databinding.FragmentThreeBinding
import com.example.sampleapp.model.accessModel


class AccessFragment : Fragment() {

    private var _binding: FragmentAccessBinding? = null
    private val binding get() = _binding!!
    private lateinit var userAdapter: AccessAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAccessBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val users = mutableListOf<accessModel>()

        for(i in 1..5){
            users.add(
                accessModel(R.drawable.image,"Alice","Software Engineer")
            )
            users.add(
                accessModel(R.drawable.image,"Bob","UI/UX")
            )
            users.add(
                accessModel(R.drawable.image,"Charlie","Project Manager")
            )
        }

        userAdapter = AccessAdapter(users)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = userAdapter

    }



}