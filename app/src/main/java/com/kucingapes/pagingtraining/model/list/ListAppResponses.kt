package com.kucingapes.pagingtraining.model.list

import com.google.gson.annotations.SerializedName

data class ListAppResponses(
        @SerializedName("datalist")
        val datalist: Datalist,
        @SerializedName("info")
        val info: Info
)