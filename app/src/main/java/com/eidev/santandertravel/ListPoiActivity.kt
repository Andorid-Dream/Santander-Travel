package com.eidev.santandertravel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson

class ListPoiActivity : AppCompatActivity() {

    private lateinit var listPois: ArrayList<PoiItem>
    private lateinit var poisAdapter: PoisAdapter
    private lateinit var poisRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_poi)

        poisRecyclerView = findViewById(R.id.pois_recycler_view)
        listPois = loadPoisFromJSON()


        poisAdapter = PoisAdapter(listPois)
        poisRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = poisAdapter
            setHasFixedSize(false)
        }

    }

    private fun loadPoisFromJSON(): ArrayList<PoiItem> {

        val poisString = applicationContext.assets.open("ciudades.json").bufferedReader().use {it.readText()}
        val gson = Gson()
        val info = gson.fromJson(poisString, Poi::class.java)

        return info
    }


}