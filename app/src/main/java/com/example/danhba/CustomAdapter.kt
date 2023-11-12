package com.example.danhba

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CustomAdapter (val activity: Activity, val list: List<Outdata>): ArrayAdapter<Outdata>(activity, R.layout.item_danh_ba) {

    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var contexs = activity.layoutInflater
        // layoutInflater la compoment chuyen layout xml thanh view trong android
        var rowView = contexs.inflate(R.layout.item_danh_ba, parent, false)
        var id = rowView.findViewById<TextView>(R.id.txtViewId)
        var name = rowView.findViewById<TextView>(R.id.txtViewName)

        id.text = list[position].id
        name.text = list[position].name


        return rowView
    }
}