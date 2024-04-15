package com.example.hw_1_7.data.repositories

import androidx.lifecycle.LiveData
import com.example.hw_1_7.base.BaseRepository
import com.example.hw_1_7.data.Resource
import com.example.hw_1_7.data.remote.ApiService
import com.example.hw_1_7.data.response.camera.CameraSecond
import com.example.hw_1_7.data.response.door.DoorModel
import com.example.hw_1_7.domain.repositories.CamerasRepository
import com.example.hw_1_7.domain.repositories.DoorsRepository
import javax.inject.Inject

class Repository @Inject constructor(private val apiService: ApiService) : CamerasRepository, DoorsRepository,BaseRepository() {
    /*fun getCameras(): LiveData<Resource<CameraSecond>> = performRequest {
        apiService.getCameras().body() as CameraSecond
    }

    fun getDoors(): LiveData<Resource<DoorModel>> = performRequest {
        apiService.getDoors().body() as DoorModel
    }
     */
    override fun getCameras(): LiveData<Resource<CameraSecond>> = performRequest {
        apiService.getCameras().body() as CameraSecond
    }

    override fun getDoors(): LiveData<Resource<DoorModel>> = performRequest{
        apiService.getDoors().body() as DoorModel
    }
}