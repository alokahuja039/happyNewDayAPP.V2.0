
package com.happyday.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val input = findViewById<EditText>(R.id.input)
        val btn = findViewById<Button>(R.id.addBtn)

        val items = ArrayList<String>()
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter

        btn.setOnClickListener {
            if(input.text.isNotEmpty()){
                items.add(input.text.toString())
                adapter.notifyDataSetChanged()
                input.text.clear()
            }
        }
    }
}
