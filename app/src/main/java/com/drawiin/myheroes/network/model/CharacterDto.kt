package com.drawiin.myheroes.network.model


import com.drawiin.myheroes.domain.model.character.Character
import com.google.gson.annotations.SerializedName

data class CharacterDto(
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("thumbnail")
    val thumbnail: ThumbnailDto? = null
)