package com.acparra.santander_travel.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.acparra.santander_travel.R
import com.acparra.santander_travel.preference.SettingsFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.overflow_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val fm : FragmentManager= supportFragmentManager
        val ft : FragmentTransaction= fm.beginTransaction()

        return when (item.itemId){
            R.id.menu_preferences -> {
                val fragmentSettings = SettingsFragment()
                ft.replace(R.id.fragmentContainerView, fragmentSettings).commit()
                ft.addToBackStack(null)
                true
            }
            android.R.id.home -> {
                onBackPressed()
                true
            }


            else -> {return true}
        }
    }

    fun showIcon(){
        val action : ActionBar? = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    fun hideIcon(){
       val action : ActionBar? = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(false)
    }
}