package com.example.danhba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var customadapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = mutableListOf<Outdata>()
        list.add(Outdata("J", "09772654801", "Josefina Lehner", "leh.@gmail.com"))
        list.add(Outdata("S", "09772654802", "Stuart Vandervort II", "van.@gmail.com"))
        list.add(Outdata("M", "09772654803", "Maddison Russel", "rus.@gmail.com"))
        list.add(Outdata("H", "09772654804", "Halie Morar II", "rar.@gmail.com"))
        list.add(Outdata("K", "09772654805", "Karelle Simonis", "nis.@gmail.com"))
        list.add(Outdata("H", "09772654806", "Hannah Welch", "wel.@gmail.com"))
        list.add(Outdata("F", "09772654807", "Fanny Frami", "fra.@gmail.com"))
        list.add(Outdata("E", "09772654808", "Elfrieda Wisozk", "wis.@gmail.com"))

        customadapter= CustomAdapter(this,list)
        //khai bao bien de link toi LvDanhba
        val LvDanhba = findViewById<ListView>(R.id.LvDanhba)
        LvDanhba.adapter= customadapter

        LvDanhba.setOnItemClickListener { parent, view, position, id ->
            //val selectedItem = list[position]
            val i2 = Intent(this, manhinhthongtin::class.java)
//            i2.putExtra("number", selectedItem.number)
//            i2.putExtra("email", selectedItem.email)
            startActivity(i2)
        }

        LvDanhba.setOnItemLongClickListener { parent, view, position, id ->
            val selectedItem = list[position]

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Chọn hành động")
            builder.setItems(arrayOf("Gọi điện", "Nhắn tin")) { dialog, which ->
                when (which) {
                    0 -> {

                    }
                    1 -> {

                    }
                }
            }

            val dialog = builder.create()
            dialog.show()

            false // Trả về false để cho phép sự kiện tiếp tục chuyển tiếp tới các thành phần khác
        }


    }
}