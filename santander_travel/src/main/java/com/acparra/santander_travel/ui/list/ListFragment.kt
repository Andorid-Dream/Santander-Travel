package com.acparra.santander_travel.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.acparra.santander_travel.databinding.FragmentListBinding
import com.acparra.santander_travel.ui.main.MainActivity
import com.acparra.santander_travel.model.PoiItem

class ListFragment : Fragment() {
    private lateinit var listBinding: FragmentListBinding
    private val listViewModel: ListViewModel by viewModels()
    private lateinit var poisAdapter: PoisAdapter
    private var listPois: ArrayList<PoiItem> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        listBinding = FragmentListBinding.inflate(inflater, container, false)

        return listBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        println("hola")
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity?)?.hideIcon()
        //listViewModel.loadMockPoisFromJSON(context?.assets?.open("ciudades.json"))

        listViewModel.getPoiFromServer()
        listViewModel.onPoisLoaded.observe(viewLifecycleOwner, { result ->
            onPoisLoadedSubscribe(result)
        })
        poisAdapter = PoisAdapter(listPois, onItemClicked = {onPoiClicked(it)})

        listBinding.poisRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = poisAdapter
            setHasFixedSize(false)
        }


    }

    private  fun onPoisLoadedSubscribe(result: ArrayList<PoiItem>?) {
        result?.let { listPois -> poisAdapter.appendItems(listPois) }
    }


    private fun onPoiClicked(poi: PoiItem){
       findNavController().navigate(ListFragmentDirections.actionListFragmentToDetailFragment(poi = poi))
       //findNavController().navigate(ListFragmentDirections.actionNavigationListToSettingsFragment())
    }

   /*private fun loadMockPoisFromJSON(): ArrayList<PoiItem> {
        val poisString: String = context?.assets?.open("ciudades.json")?.bufferedReader().use {it!!.readText()}
        val gson = Gson()
        val poisList = gson.fromJson(poisString, Poi::class.java)
        return poisList
   }*/

}