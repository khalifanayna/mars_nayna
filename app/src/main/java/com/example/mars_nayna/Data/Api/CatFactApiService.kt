package com.example.mars_nayna.Data.Api

import com.example.mars_nayna.Data.Model.CatFactModel
import retrofit2.http.GET

interface CatFactApiService {
    @GET("fact")
    suspend fun getCatFact(): CatFactModel
}