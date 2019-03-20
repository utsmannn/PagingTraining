package com.kucingapes.pagingtraining

import android.support.v7.util.DiffUtil

class PersonDiffCallback : DiffUtil.ItemCallback<Person>() {
    override fun areItemsTheSame(p0: Person, p1: Person): Boolean {
        return p0 == p1
    }

    override fun areContentsTheSame(p0: Person, p1: Person): Boolean {
        return p0.id == p1.id
    }
}