package com.example.hw_1_7.data.response.door

import com.google.gson.annotations.SerializedName

data class DoorModel(
    @SerializedName("data")
    val data: List<Data>,
    @SerializedName("success")
    val success: Boolean
){
    data class Data(
        @SerializedName("favorites")
        val favorites: Boolean,
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String,
        @SerializedName("room")
        val room: String,
        @SerializedName("snapshot")
        val snapshot: String
    )
}
