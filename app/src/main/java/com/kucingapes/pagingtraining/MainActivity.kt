package com.kucingapes.pagingtraining

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var personViewModel: PersonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        personViewModel = ViewModelProviders.of(this).get(PersonViewModel::class.java)

        val adapter = PersonAdapter(this)
        recyclerview_person.layoutManager = LinearLayoutManager(this)
        recyclerview_person.adapter = adapter

        subscribeUi(adapter)
    }

    private fun subscribeUi(adapter: PersonAdapter) {
        personViewModel.getPerson().observe(this, Observer { persons ->
            if (persons != null) {
                adapter.submitList(persons)
            }

            //Log.i("ANJAY", persons?.size.toString())
        })
    }
}
