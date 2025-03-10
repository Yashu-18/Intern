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
import com.example.sampleapp.databinding.FragmentCoverBinding

class CoverFragment : BaseFragment<FragmentCoverBinding>(R.layout.fragment_cover) {

    override val binding by lazy { FragmentCoverBinding.inflate(layoutInflater) }

    override fun onBackPressed() {
        // Handle back press logic if needed
    }

    // Image Picker Launcher
    private val imagePickerLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK && result.data != null) {
            val imageUri: Uri? = result.data?.data
            imageUri?.let {
                binding.placeImage.setImageURI(it) // Set the selected image
                binding.plusIcon.visibility = View.GONE // Hide the plus icon
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Open Image Picker when the CoverImage is clicked
        binding.placeImage.setOnClickListener {
            openImagePicker()
        }

        // Reset image on long press (optional)
        binding.placeImage.setOnLongClickListener {
            binding.placeImage.setImageResource(R.drawable.custom_thum_setting) // Reset to default
            binding.plusIcon.visibility = View.VISIBLE // Show plus icon again
            true
        }
    }

    // Function to Open Image Picker (Gallery & Camera)
    private fun openImagePicker() {
        val galleryIntent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        val chooserIntent = Intent.createChooser(galleryIntent, "Select Image")
        chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, arrayOf(cameraIntent))
        imagePickerLauncher.launch(chooserIntent)
    }
}
