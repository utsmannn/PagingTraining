package com.kucingapes.pagingtraining.model.list

import com.google.gson.annotations.SerializedName

data class Datalist(
        @SerializedName("count")
        val count: Int,
        @SerializedName("hidden")
        val hidden: Int,
        @SerializedName("limit")
        val limit: Int,
        @SerializedName("list")
        val list: List<X>,
        @SerializedName("loaded")
        val loaded: Boolean,
        @SerializedName("next")
        val next: Int,
        @SerializedName("offset")
        val offset: Int,
        @SerializedName("total")
        val total: Int
)