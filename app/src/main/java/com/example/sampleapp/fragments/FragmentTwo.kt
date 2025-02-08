package com.example.sampleapp.fragments

import android.content.res.ColorStateList
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

    private var isContriBtnClicked = false
    private var isViewBtnClicked = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.contriBtn.setOnClickListener {
            isContriBtnClicked = !isContriBtnClicked

            if (isContriBtnClicked) {
                binding.contriBtn.buttonTintList = ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.orange))

                // Load the fragment after a delay
                binding.contriBtn.postDelayed({
                    (activity as MainActivity).loadFragment(FragmentThree())
                }, 500)

                isViewBtnClicked = true
            } else {
                binding.contriBtn.buttonTintList = null
            }
        }

        binding.viewBtn.setOnClickListener {
            isViewBtnClicked = !isViewBtnClicked
            isContriBtnClicked = false

            if (isViewBtnClicked) {
                binding.viewBtn.buttonTintList = ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.orange))
                binding.contriBtn.buttonTintList = null
            } else {
                binding.viewBtn.buttonTintList = null 
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Prevent memory leaks
    }
}
