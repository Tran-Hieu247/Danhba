package com.example.danhba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class manhinhthongtin : AppCompatActivity() {
    lateinit var customadapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.man_hinh_thong_tin)

        var hienthinumber= findViewById<TextView>(R.id.txtViewNumber)
        var hienthiemail= findViewById<TextView>(R.id.txtViewEmail)
        //get du lieu
        val i = intent
        val phone = i.getStringExtra("number")
        val email = i.getStringExtra("email")
        hienthinumber.setText(phone)
        hienthiemail.setText(email)





    }


}