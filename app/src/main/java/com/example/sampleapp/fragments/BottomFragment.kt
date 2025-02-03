package com.example.sampleapp.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentBottomBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentBottomBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBottomBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Use ContextCompat.getColor to handle colors properly
        val orangeColor = ContextCompat.getColor(requireContext(), R.color.orange)
        val greyColor = ContextCompat.getColor(requireContext(), R.color.grey)
        var colour:Boolean = false
        if(!colour){
            binding.admin.setCardBackgroundColor(greyColor)
            binding.view.setCardBackgroundColor(greyColor)
            binding.contribution.setCardBackgroundColor(greyColor)
        }
        // Set onClickListeners for all CardViews
        binding.admin.setOnClickListener {


                colour = true
                if(colour) {
                    binding.admin.setCardBackgroundColor(orangeColor)
                    binding.view.setCardBackgroundColor(orangeColor)
                    binding.contribution.setCardBackgroundColor(orangeColor)
                }


        }

        binding.view.setOnClickListener {
            binding.view.setCardBackgroundColor(orangeColor)
        }

        binding.contribution.setOnClickListener {
            binding.contribution.setCardBackgroundColor(orangeColor)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}