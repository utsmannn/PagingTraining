package com.kucingapes.pagingtraining.model.list

import com.google.gson.annotations.SerializedName

data class Appcoins(
        @SerializedName("advertising")
        val advertising: Boolean,
        @SerializedName("billing")
        val billing: Boolean
)