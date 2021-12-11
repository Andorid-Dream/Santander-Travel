package com.acparra.santander_travel.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.acparra.santander_travel.data.PoiRepository
import com.acparra.santander_travel.model.Poi
import com.acparra.santander_travel.model.PoiItem
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.InputStream

class ListViewModel : ViewModel() {
    private var poisLoad : MutableLiveData<ArrayList<PoiItem>> = MutableLiveData()
    val onPoisLoaded: LiveData<ArrayList<PoiItem>> = poisLoad

    private val repository = PoiRepository()

    fun getPoiFromServer(){
        GlobalScope.launch (Dispatchers.IO ) {
            poisLoad.value = repository.getPoi()
        }
    }

    fun loadMockPoisFromJSON(poisString: InputStream?) {
        val poisString = poisString?.bufferedReader().use {it!!.readText()}
        val gson = Gson()
        poisLoad.value = gson.fromJson(poisString, Poi::class.java)
    }
}