package com.acparra.santander_travel.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.acparra.santander_travel.databinding.FragmentListBinding
import com.acparra.santander_travel.main.MainActivity
import com.acparra.santander_travel.model.Poi
import com.acparra.santander_travel.model.PoiItem
import com.google.gson.Gson

class ListFragment : Fragment() {
    private lateinit var listBinding: FragmentListBinding
    private lateinit var poisAdapter: PoisAdapter
    private lateinit var listPois: ArrayList<PoiItem>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        listBinding = FragmentListBinding.inflate(inflater, container, false)

        return listBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity?)?.hideIcon()
        listPois = loadMockPoisFromJSON()
        poisAdapter = PoisAdapter(listPois, onItemClicked = {onPoiClicked(it)})

        listBinding.poisRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = poisAdapter
            setHasFixedSize(false)
        }
    }



    private fun onPoiClicked(poi: PoiItem){
       // findNavController().navigate(ListFragmentDirections.actionListFragmentToDetailFragment(poi = poi))
       findNavController().navigate(ListFragmentDirections.actionNavigationListToSettingsFragment())
    }

    private fun loadMockPoisFromJSON(): ArrayList<PoiItem> {
        val poisString: String = context?.assets?.open("ciudades.json")?.bufferedReader().use {it!!.readText()}
        val gson = Gson()
        val poisList = gson.fromJson(poisString, Poi::class.java)
        return poisList
    }

}