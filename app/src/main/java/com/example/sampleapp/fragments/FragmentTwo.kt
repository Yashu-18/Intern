package com.example.sampleapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.sampleapp.MainActivity
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {

    private var _binding: FragmentTwoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.contriBtn.setOnClickListener {
            binding.contriBtn.setOnClickListener {
                // Toggle the selected state on click
                binding.contriBtn.isSelected = !binding.contriBtn.isSelected
                binding.viewBtn.isSelected = !binding.viewBtn.isSelected

                // Load the fragment
                binding.contriBtn.postDelayed({
                    // After the delay, load the fragment
                    (activity as MainActivity).loadFragment(FragmentThree())
                }, 500)
            }
        }



        binding.viewBtn.setOnClickListener(){
            binding.viewBtn.isSelected = !binding.viewBtn.isSelected
            binding.viewBtn.setBackgroundResource(R.drawable.circular_button)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Prevent memory leaks by clearing the binding
    }
}
