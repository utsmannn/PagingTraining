package com.kucingapes.pagingtraining.model.list

import com.google.gson.annotations.SerializedName

data class Stats(
        @SerializedName("downloads")
        val downloads: Int,
        @SerializedName("pdownloads")
        val pdownloads: Int,
        @SerializedName("prating")
        val prating: Prating,
        @SerializedName("rating")
        val rating: Rating
)