package com.kucingapes.pagingtraining

import android.arch.paging.PagedListAdapter
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_person.view.*

class PersonAdapter(private val context: Context) : PagedListAdapter<Person, PersonAdapter.PersonViewHolder>(PersonDiffCallback()) {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PersonViewHolder {
        return PersonViewHolder(LayoutInflater.from(context).inflate(R.layout.item_person, p0, false))
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = getItem(position)

        if (person == null) {
            holder.clear()
        } else {
            holder.bind(person)
        }

        Log.i("ANJAY", person?.name.toString())
    }

    class PersonViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val textName = view.text_person

        fun bind(person: Person) {
            textName.text = person.name


        }

        fun clear() {
            textName.text = null
        }
    }
}