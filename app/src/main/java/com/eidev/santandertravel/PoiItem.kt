package com.eidev.santandertravel
import com.google.gson.annotations.SerializedName

data class PoiItem(
    @SerializedName("name")
    val name: String,
    @SerializedName("score")
    val score: String,
    @SerializedName("shortDetail")
    val shortDetail: String,
    @SerializedName("urlPicture")
    val urlPicture: String
)