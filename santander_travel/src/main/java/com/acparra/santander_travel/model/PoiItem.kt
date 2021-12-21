package com.acparra.santander_travel.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PoiItem(
    @SerializedName("generalInformation")
    val generalInformation: String,
    @SerializedName("latitude")
    val latitude: Double,
    @SerializedName("longitude")
    val longitude: Double,
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
) : Serializable