package com.example.semana03listview

import android.R.layout
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var arrSO =  arrayOf(
        "Android", "iPhone", "Windows Phone", "Blackberry", "Firefox OS", "Amazon World", "Nokia"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lsvSistemasOperativos: ListView = findViewById<View>(R.id.lsvSO) as ListView
        //Se crea un adaptador para llenar la lista
        val adaptador: Any? =
            ArrayAdapter<Any?>(this, layout -simplet_list_item_1, arrSO)
        //Se asigna el adaptador a la view
        lsvSistemasOperativos.adapter = adaptador as ListAdapter?

        //Se genera el método setOnClickListener de la view

        lsvSistemasOperativos.setOnItemClickListener{ parent, view, position, id ->
            Toast.makeText(
                applicationContext,
                "Posición: $position",
                Toast.LENGTH_SHORT
            ).show()

        }
}