package com.kucingapes.pagingtraining

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.paging.DataSource
import android.arch.paging.LivePagedListBuilder
import android.arch.paging.PagedList

class PersonViewModel constructor(application: Application) : AndroidViewModel(application) {

    fun getPerson(): LiveData<PagedList<Person>> {

        val factory: DataSource.Factory<Int, Person> = AppDatabase.getInstance(getApplication()).personDao().getAllPaged()

        val pageListBuilder: LivePagedListBuilder<Int, Person> = LivePagedListBuilder(factory, 30)

        return pageListBuilder.build()
    }
}