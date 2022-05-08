package com.example.listview

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.firstList)
        val array = arrayListOf<String>(
            "Angra dos Reis", "Caldas Novas", "Campos do Jordão",
            "Costa de Sauípe", "Ilhéus", "Porto Seguro", "Tiradentes",
            "Praga", "Santiago", "Zurique", "Caribe", "Buenos Aires",
            "Buda Peste", "Cancun", "Aruba" , "Brasil",
            "México"
        )

        val createList = ArrayAdapter<String>(
            applicationContext,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            array
        )

        listView.setAdapter(createList)

        listView.setOnItemClickListener(AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val select = listView.getItemAtPosition(i).toString()
            Toast.makeText(
                applicationContext,
                select,
                Toast.LENGTH_SHORT
            ).show()
        })

    }

}

