package com.example.hw_1_7.presentation.cameras

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.hw_1_7.databinding.ItemCameraBinding
import com.example.hw_1_7.data.response.camera.CameraSecond

class CameraAdapter: ListAdapter<CameraSecond.Data.Camera, CameraViewHolder>(
    CameraDiffCallback()
) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CameraViewHolder {
        return CameraViewHolder(
            ItemCameraBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CameraViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class CameraViewHolder(private val binding: ItemCameraBinding) : ViewHolder(binding.root) {
    fun bind(position: CameraSecond.Data.Camera) = with(binding){
        tvCamera.text = position.name
        tvRoomName.text = position.room
        imgRoom.load(position.snapshot)
    }
}

class CameraDiffCallback : DiffUtil.ItemCallback<CameraSecond.Data.Camera>() {
    override fun areContentsTheSame(oldItem: CameraSecond.Data.Camera, newItem: CameraSecond.Data.Camera) = oldItem.id == newItem.id
    override fun areItemsTheSame(oldItem: CameraSecond.Data.Camera, newItem: CameraSecond.Data.Camera) = oldItem == newItem
}