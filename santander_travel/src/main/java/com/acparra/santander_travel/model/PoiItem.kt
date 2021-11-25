package com.acparra.santander_travel.model
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PoiItem(
    @SerializedName("name")
    val name: String,
    @SerializedName("score")
    val score: String,
    @SerializedName("shortDetail")
    val shortDetail: String,
    @SerializedName("urlPicture")
    val urlPicture: String
) : Serializable