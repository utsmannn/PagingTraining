package com.kucingapes.pagingtraining.model.list

import com.google.gson.annotations.SerializedName

data class File(
        @SerializedName("filesize")
        val filesize: Int,
        @SerializedName("md5sum")
        val md5sum: String,
        @SerializedName("tags")
        val tags: List<Any>,
        @SerializedName("vercode")
        val vercode: Int,
        @SerializedName("vername")
        val vername: String
)