package com.example.sampleapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleapp.databinding.ItemLabelBinding
import com.example.sampleapp.model.labelModel

class LabelAdapter(private val items: List<labelModel>) :
    RecyclerView.Adapter<LabelAdapter.LabelViewHolder>() {

    inner class LabelViewHolder(val binding: ItemLabelBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LabelViewHolder {
        val binding = ItemLabelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LabelViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LabelViewHolder, position: Int) {
        val item = items[position]
        with(holder.binding) {
            itemImage.setImageResource(item.imageRes)
            itemTitle.text = item.title
            itemSubtitle.text = item.subtitle
            itemCheckBox.isChecked = item.isChecked

            // Toggle checkbox on click
            itemCheckBox.setOnCheckedChangeListener { _, isChecked ->
                item.isChecked = isChecked
            }
        }
    }

    override fun getItemCount(): Int = items.size
}
