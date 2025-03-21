package com.example.sampleapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleapp.databinding.AccessItemBinding
import com.example.sampleapp.BottomFragments.BottomFragment
import com.example.sampleapp.model.accessModel

class AccessAdapter(private val userlist:List<accessModel>,private val fragmentManager: FragmentManager):RecyclerView.Adapter<AccessAdapter.UserViewHolder>() {

    inner class UserViewHolder(private val binding: AccessItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(user: accessModel) {
            binding.profileImage.setImageResource(user.image)
            binding.name.text = user.name
            binding.disignation.text = user.designation

            binding.addBtn.setOnClickListener {
                val bottomSheet = BottomFragment()
                bottomSheet.show(fragmentManager, "BottomSheetTag")
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = AccessItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(userlist[position])
    }

    override fun getItemCount(): Int = userlist.size
}