package com.acparra.santander_travel.model


import com.google.gson.annotations.SerializedName

data class PoiItem(
    @SerializedName("generalInformation")
    val generalInformation: String,
    @SerializedName("latitude")
    val latitude: Float,
    @SerializedName("longitude")
    val longitude: Float,
    @SerializedName("name")
    val name: String,
    @SerializedName("recommendedSites")
    val recommendedSites: String,
    @SerializedName("score")
    val score: String,
    @SerializedName("shortDetail")
    val shortDetail: String,
    @SerializedName("temperature")
    val temperature: Int,
    @SerializedName("urlPicture")
    val urlPicture: String
)