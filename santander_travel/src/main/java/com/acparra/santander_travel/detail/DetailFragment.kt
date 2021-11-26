package com.acparra.santander_travel.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.acparra.santander_travel.databinding.FragmentDetailBinding
import com.squareup.picasso.Picasso

class DetailFragment : Fragment() {

    private lateinit var detailBinding: FragmentDetailBinding
    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        detailBinding = FragmentDetailBinding.inflate(inflater, container, false)

        return detailBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sitio = args.poi

        with(detailBinding){
            sitioNombre.text = sitio.name
            sitioInformacion.text = sitio.generalInformation
            sitioLongitud.text = sitio.longitude.toString()
            sitioLatitud.text = sitio.latitude.toString()
            sitioTemperatura.text = sitio.temperature.toString()
            sitiosRecomendadosSitio.text = sitio.recommendedSites
            Picasso.get().load(sitio.urlPicture).into(sitioImagen)
        }
    }
}