package com.example.hw_1_7.presentation.doors

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.hw_1_7.data.Resource
import com.example.hw_1_7.data.response.door.DoorModel
import com.example.hw_1_7.domain.usecases.GetDoorsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DoorsViewModel @Inject constructor(private val getDoorsUseCase: GetDoorsUseCase):ViewModel() {
    fun getDoors():LiveData<Resource<DoorModel>> = getDoorsUseCase.getDoors()
}