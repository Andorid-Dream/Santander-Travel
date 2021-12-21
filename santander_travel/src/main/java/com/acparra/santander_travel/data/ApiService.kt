package com.acparra.santander_travel.data

import com.acparra.santander_travel.model.Poi
import retrofit2.http.GET

interface ApiService {
    @GET("Andorid-Dream/Santander-Travel/ciudades")
    suspend fun getPoi(): Poi

}