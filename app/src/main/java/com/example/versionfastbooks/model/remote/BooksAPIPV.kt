package com.example.versionfastbooks.model.remote

import com.example.versionfastbooks.model.dataclass.BooksDetailPV
import com.example.versionfastbooks.model.dataclass.BooksPV
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

//https://my-json-server.typicode.com/Himuravidal/anchorBooks/bookDetail/1
//https://my-json-server.typicode.com/Himuravidal/anchorBooks/books
interface BooksAPIPV {

    @GET("books")
    suspend fun getBooksInterRetro(): Response<List<BooksPV>>

    @GET("bookDetail/{id}")
    suspend fun getDetailInstaRetro(@Path("id") id: String): Response<List<BooksDetailPV>>
}