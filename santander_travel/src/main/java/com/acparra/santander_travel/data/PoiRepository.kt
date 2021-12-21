package com.acparra.santander_travel.data

class PoiRepository {
    suspend fun getPoi() = ApiFactory.retrofit.getPoi()
}