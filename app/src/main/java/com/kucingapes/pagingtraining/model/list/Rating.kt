package com.kucingapes.pagingtraining.model.list

import com.google.gson.annotations.SerializedName

data class Rating(
        @SerializedName("avg")
        val avg: Int,
        @SerializedName("total")
        val total: Int
)