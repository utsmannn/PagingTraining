package com.kucingapes.pagingtraining

import com.kucingapes.pagingtraining.model.list.X
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CategoriesServices {

    @GET("/api/7/apps/get/group_name={category}/limit=10/mature=false")
    fun getAppCategory(@Path("category") category: String): Call<List<X>>
}