package com.acparra.santander_travel.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.acparra.santander_travel.R
import com.acparra.santander_travel.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var detailBinding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        detailBinding = FragmentDetailBinding.inflate(inflater, container, false)

        return detailBinding.root
    }
}