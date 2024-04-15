package com.example.hw_1_7.base

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import com.example.hw_1_7.data.Resource
import com.example.hw_1_7.utils.showToast

abstract class BaseFragment:Fragment() {

    fun <T> LiveData<Resource<T>>.stateHandler(
        success:(data:T) -> Unit,
        state: ((res:Resource<T>)->Unit) ?= null
    ){
        observe(this@BaseFragment){res->
            state?.invoke(res)
            when(res){
                is Resource.Error ->{
                    this@BaseFragment.showToast(res.message!!)
                }
                is Resource.Loading ->{}
                is Resource.Success ->{
                    if (res.data != null){
                        success(res.data)
                    }
                }
                else ->{this@BaseFragment.showToast("else")}
            }
        }
    }

}