package com.example.android.trackmysleepquality.sleeptracker

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.R
import com.example.android.trackmysleepquality.TextItemViewHolder
import com.example.android.trackmysleepquality.database.SleepNight

class SleepNightAdapter: RecyclerView.Adapter<TextItemViewHolder>() {

    var sleepNights = listOf<SleepNight>()
        set(value) {
            field = value
            // when this guy is called, the RecyclerView redraws the whole list, not just the changed items
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int {
        return sleepNights.size
    }

    override fun onBindViewHolder(holder: TextItemViewHolder, position: Int) {
        val night = sleepNights[position]
        holder.textView.text = night.sleepQuality.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.text_item_view, parent, false) as TextView
        return TextItemViewHolder(view)
    }

}