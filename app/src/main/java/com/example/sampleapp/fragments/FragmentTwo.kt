package com.example.sampleapp.fragments

import android.content.res.ColorStateList
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.MainActivity
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentTwoBinding

 class FragmentTwo : BaseFragment<FragmentTwoBinding>(R.layout.fragment_two) {

    override val binding by lazy { FragmentTwoBinding.inflate(layoutInflater) }

    private var isContriBtnClicked = false
    private var isViewBtnClicked = false

     override fun onBackPressed() {
         TODO("Not yet implemented")
     }

     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.contriBtn.setOnClickListener {
            isContriBtnClicked = !isContriBtnClicked

            if (isContriBtnClicked) {
                binding.contriBtn.buttonTintList = ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.orange))

                // Load the fragment after a delay
//                binding.contriBtn.postDelayed({
//                    (activity as MainActivity).loadFragment(FragmentThree())
//                }, 500)

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
}
