package com.example.recyclerviewapp

import android.provider.SyncStateContract
import com.example.recyclerviewapp.apiLink.Companion.clientId
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface retrofit {

    @GET("/photos")
    suspend fun getImages(@Query("client_id") clientId: String, @Query("page") page: Int): Response<List<laytext>>



}


