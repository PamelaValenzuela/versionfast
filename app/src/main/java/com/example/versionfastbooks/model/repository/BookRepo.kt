package com.example.versionfastbooks.model.repository

import android.util.Log
import com.example.versionfastbooks.model.remote.RetrofitClient

class BookRepo {

    suspend fun getBooksRepo() {
        Log.d("FuncionaRepositoryGet","getBooks")
        val mResponseRepo = RetrofitClient.retrofitInstance().getBooksInterRetro()

        if(mResponseRepo.isSuccessful) {
            mResponseRepo.body()?.let {
                Log.d("FuncionaGETRepo", "tenemos ${it.size} Books")
            }
        } else {
            Log.d("NOfunciona repository","${mResponseRepo.errorBody()}")
        }
    }

}