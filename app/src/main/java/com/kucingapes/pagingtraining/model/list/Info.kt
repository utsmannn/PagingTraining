package com.kucingapes.pagingtraining.model.list

import com.google.gson.annotations.SerializedName

data class Info(
        @SerializedName("status")
        val status: String,
        @SerializedName("time")
        val time: Time
)