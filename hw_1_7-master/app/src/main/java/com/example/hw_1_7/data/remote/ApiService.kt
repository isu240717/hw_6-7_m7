package com.example.hw_1_7.data.remote

import com.example.hw_1_7.data.response.camera.CameraSecond
import com.example.hw_1_7.data.response.door.DoorModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("cameras/")
    suspend fun getCameras():Response<CameraSecond>

    @GET("doors/")
    suspend fun getDoors():Response<DoorModel>
}