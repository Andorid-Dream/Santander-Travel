package com.acparra.santander_travel.detail
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.acparra.santander_travel.databinding.FragmentDetailBinding
import com.acparra.santander_travel.main.MainActivity
import com.squareup.picasso.Picasso

class DetailFragment : Fragment() {

    private val detailViewModel: DetailViewModel by viewModels()
    private lateinit var detailBinding: FragmentDetailBinding
    private val args: DetailFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity as MainActivity?)?.showIcon()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        detailBinding = FragmentDetailBinding.inflate(inflater, container, false)

        return detailBinding.root
    }

    override fun onViewCreated(view:View,  savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sitio = args.poi

        with(detailBinding){
            sitioNombre.text = sitio.name
            sitioInformacion.text = sitio.generalInformation
            sitioTemperatura.text = sitio.temperature.toString()
            sitiosRecomendadosSitio.text = sitio.recommendedSites
            Picasso.get().load(sitio.urlPicture).into(sitioImagen)


            mapButton.setOnClickListener(){
                findNavController().navigate(DetailFragmentDirections.actionNavigationDetailToMapsFragment(poi = sitio))
            }
        }
    }
}