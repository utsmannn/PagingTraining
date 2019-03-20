package com.kucingapes.pagingtraining

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CategoriesRepository {

    fun create() : CategoriesServices {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://ws75.aptoide.com")
            .build()

        return retrofit.create(CategoriesServices::class.java)
    }
}