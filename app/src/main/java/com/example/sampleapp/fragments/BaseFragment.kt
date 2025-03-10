package com.collabdiary.android.views.fragments

import android.animation.ObjectAnimator.ofFloat
import android.animation.ValueAnimator
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.sampleapp.R


/**Parent class of all the fragments in this project*/
abstract class BaseFragment<B : ViewBinding>(private val fragmentLayout: Int) : Fragment()  {

   // private val constraintLayout: ConstraintLayout? by lazy { view?.findViewById(R.id.constraintLayout)!! }

    /**
     *  Generic ViewBinding of the subclasses
     * */
    abstract val binding: B


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Adding an option to handle the back press in fragment
        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    onBackPressed()
                }
            })

        return binding.root
    }



    /**
     * An abstract function which will be called on the Back button press
     * */
    abstract fun onBackPressed()
}





