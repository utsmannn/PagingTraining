package com.kucingapes.pagingtraining.model.list

import com.google.gson.annotations.SerializedName

data class Store(
        @SerializedName("avatar")
        val avatar: String,
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String
)