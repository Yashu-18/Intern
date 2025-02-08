package com.example.sampleapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sampleapp.MainActivity
import com.example.sampleapp.databinding.FragmentOneBinding  // Import the binding class

class FragmentOne : Fragment() {

    private var _binding: FragmentOneBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Navigate to SecondFragment on button click
        binding.privacy.setOnClickListener {
            (activity as MainActivity).loadFragment(FragmentTwo())
        }

        binding.insights.setOnClickListener {
            (activity as MainActivity).loadFragment(InsightsFragment())
        }

        binding.cover.setOnClickListener {
            (activity as MainActivity).loadFragment(CoverFragment())
        }

        binding.mediaType.setOnClickListener {
            (activity as MainActivity).loadFragment(MediaFragment())
        }

        binding.inputType.setOnClickListener {
            (activity as MainActivity).loadFragment(InputTypeFragment())
        }

        binding.connect.setOnClickListener {
            (activity as MainActivity).loadFragment(ConnectDiaryFragment())
        }

        binding.highlights.setOnClickListener {
            (activity as MainActivity).loadFragment(HighlightsFragment())
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        if (parentFragmentManager.backStackEntryCount == 0) {
            activity?.finish()
        }
    }
}
