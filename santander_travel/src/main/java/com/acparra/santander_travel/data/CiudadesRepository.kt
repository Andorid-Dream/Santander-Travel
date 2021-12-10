package com.acparra.santander_travel.data

class CiudadesRepository {

    suspend fun getCiudades() = ApiFactory.retrofit.getCiudades()
}