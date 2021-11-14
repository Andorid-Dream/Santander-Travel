package com.eidev.santandertravel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagenSitio : ImageView = findViewById(R.id.sitio_imagen)
        val nombreSitio : TextView = findViewById(R.id.sitio_nombre)
        val informacionSitio : TextView = findViewById(R.id.sitio_informacion)
        val ubicacionSitio : TextView = findViewById(R.id.sitio_ubicacion)
        val temperaturaSitio : TextView = findViewById(R.id.sitio_temperatura)
        val sitiosRecomendadosSitio : TextView = findViewById(R.id.sitios_recomendados_sitio)
        val array = resources.getStringArray(R.array.sitios_turisticos)
        nombreSitio.text = array[0]
        informacionSitio.text = array[1]
        ubicacionSitio.text = array[2]
        temperaturaSitio.text = array[3]
        sitiosRecomendadosSitio.text = array[4]


        imagenSitio.setImageResource(resources.getIdentifier(array[6], "drawable", packageName))

    }


}