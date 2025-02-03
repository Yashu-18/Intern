package com.example.sampleapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sampleapp.MainActivity
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentThreeBinding
import com.example.sampleapp.databinding.FragmentTwoBinding


class FragmentThree : Fragment() {

    private var _binding: FragmentThreeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.crewbtn.setOnClickListener(){
            ( activity as MainActivity).loadFragment(CrewMemberFragment())
        }

        binding.groupbtn.setOnClickListener(){
            ( activity as MainActivity).loadFragment(GroupFragment())
        }
        binding.custombtn.setOnClickListener(){
            ( activity as MainActivity).loadFragment(AccessFragment())
        }

    }


}