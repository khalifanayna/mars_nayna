package com.example.mars_nayna.Data.Api

import com.example.mars_nayna.Data.Model.PhotoModel
import retrofit2.http.GET

interface PhotoApiService {
    @GET("list")
    suspend fun getPhotos(): List<PhotoModel>
}