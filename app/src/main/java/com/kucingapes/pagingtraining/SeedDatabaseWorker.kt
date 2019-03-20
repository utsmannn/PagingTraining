package com.kucingapes.pagingtraining

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import java.lang.Exception
import java.util.*

class SeedDatabaseWorker(context: Context, workerParam: WorkerParameters) : CoroutineWorker(context, workerParam) {

    override val coroutineContext = Dispatchers.IO

    override suspend fun doWork(): Result = coroutineScope {

        val nameList: MutableList<Person> = mutableListOf()
        val listApp: MutableList<String> = Utils.getAppCategories().toMutableList()

        for (a in listApp) {
            nameList.add(Person(UUID.randomUUID().toString(), a))
        }

        val database = AppDatabase.getInstance(applicationContext)
        database.personDao().insertAll(nameList)
        Result.success()

        /*try {
            applicationContext.assets.open("names.json").use { inputStream ->
                JsonReader(inputStream.reader()).use { jsonReader ->
                    val nameType = object : TypeToken<List<Person>>() {}.type
                    //val nameList: List<Person> = Gson().fromJson(jsonReader, nameType)
                    val nameList: List<Person> = Gson().fromJson(jsonReader, nameType)

                    val database = AppDatabase.getInstance(applicationContext)
                    database.personDao().insertAll(nameList)

                    //Log.i("ANJAY", nameList.size.toString())

                    Result.success()
                }

            }
        } catch (e: Exception) {
            Log.e(this@SeedDatabaseWorker.javaClass.simpleName, e.localizedMessage)
            Result.failure()
        }*/
    }


}