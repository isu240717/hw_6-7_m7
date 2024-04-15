package com.example.hw_1_7.domain.repositories

import androidx.lifecycle.LiveData
import com.example.hw_1_7.data.Resource
import com.example.hw_1_7.data.response.door.DoorModel

interface DoorsRepository {
    fun getDoors():LiveData<Resource<DoorModel>>
}