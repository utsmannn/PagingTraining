package com.kucingapes.pagingtraining.model.list

import com.google.gson.annotations.SerializedName

data class X(
        @SerializedName("added")
        val added: String,
        @SerializedName("appcoins")
        val appcoins: Appcoins,
        @SerializedName("file")
        val `file`: File,
        @SerializedName("graphic")
        val graphic: Any,
        @SerializedName("icon")
        val icon: String,
        @SerializedName("id")
        val id: Int,
        @SerializedName("modified")
        val modified: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("obb")
        val obb: Any,
        @SerializedName("package")
        val packageX: String,
        @SerializedName("size")
        val size: Int,
        @SerializedName("stats")
        val stats: Stats,
        @SerializedName("store")
        val store: Store,
        @SerializedName("uname")
        val uname: String,
        @SerializedName("updated")
        val updated: String,
        @SerializedName("uptype")
        val uptype: String
)