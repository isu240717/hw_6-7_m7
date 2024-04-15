package com.example.hw_1_7.presentation.doors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.hw_1_7.databinding.ItemDoorsBinding
import com.example.hw_1_7.data.response.door.DoorModel

class DoorsAdapter():Adapter<DoorsAdapter.DoorsViewHolder>(){

    private var list = listOf<DoorModel.Data>()

    fun setDataAdapter(list: List<DoorModel.Data>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoorsViewHolder {
        return DoorsViewHolder(ItemDoorsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: DoorsViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class DoorsViewHolder(private val binding: ItemDoorsBinding) : ViewHolder(binding.root) {
        fun bind(position: DoorModel.Data) = with(binding) {
            itemView.setOnClickListener {
                if (imgDoor.visibility == View.GONE) {
                    imgDoor.visibility =
                        View.VISIBLE; btnPlay.visibility = View.VISIBLE
                } else {
                    imgDoor.visibility = View.GONE
                    btnPlay.visibility = View.GONE
                }
            }
            tvNameDoor.text = position.name
            Glide.with(imgDoor).load(position.snapshot).into(imgDoor)
        }
    }


}