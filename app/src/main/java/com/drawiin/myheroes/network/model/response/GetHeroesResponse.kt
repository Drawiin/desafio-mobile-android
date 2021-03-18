package com.drawiin.myheroes.network.model.response


import com.drawiin.myheroes.network.model.DataDto
import com.google.gson.annotations.SerializedName

data class GetHeroesResponse(
    @SerializedName("attributionHTML")
    val attributionHTML: String?,
    @SerializedName("attributionText")
    val attributionText: String?,
    @SerializedName("code")
    val code: Int?,
    @SerializedName("copyright")
    val copyright: String?,
    @SerializedName("data")
    val data: DataDto?,
    @SerializedName("etag")
    val etag: String?,
    @SerializedName("status")
    val status: String?
)