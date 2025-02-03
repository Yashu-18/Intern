package com.example.sampleapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleapp.databinding.AccessItemBinding
import com.example.sampleapp.fragments.BottomFragment
import com.example.sampleapp.model.accessModel

class AdminAdapter(private val userlist:List<accessModel>):
    RecyclerView.Adapter<AdminAdapter.UserViewHolder>() {

    inner class UserViewHolder(private val binding: AccessItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(user: accessModel) {
            binding.profileImage.setImageResource(user.image)
            binding.name.text = user.name
            binding.disignation.text = user.designation
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = AccessItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return userlist.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(userlist[position])
    }
}