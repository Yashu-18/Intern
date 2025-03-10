package com.example.sampleapp.fragments

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentNewLabelBinding

class NewLabelFragment : BaseFragment<FragmentNewLabelBinding>(R.layout.fragment_new_label) {

    override val binding by lazy { FragmentNewLabelBinding.inflate(layoutInflater) }

    override fun onBackPressed() {
        TODO("Not yet implemented")
    }

    // Image Picker Launcher
    private val imagePickerLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK && result.data != null) {
            val imageUri: Uri? = result.data?.data
            imageUri?.let {
                binding.imagePicker.setImageURI(it)
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Open Image Picker when button is clicked
        binding.imagePicker.setOnClickListener {
            openImagePicker()
        }
    }

    // Function to Open Image Picker
    private fun openImagePicker() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        imagePickerLauncher.launch(intent)
    }
}
