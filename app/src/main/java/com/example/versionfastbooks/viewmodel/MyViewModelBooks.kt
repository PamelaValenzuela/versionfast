package com.example.versionfastbooks.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.versionfastbooks.model.repository.BookRepo
import kotlinx.coroutines.launch

class MyViewModelBooks : ViewModel() {

    private val mInstanciaRepositoryVM = BookRepo()

    init {
        Log.d("init de viewmodels","cargando la información de los paises")
        viewModelScope.launch {
            mInstanciaRepositoryVM.getBooksRepo()
        }
    }

    fun doSomething(){

    }
}