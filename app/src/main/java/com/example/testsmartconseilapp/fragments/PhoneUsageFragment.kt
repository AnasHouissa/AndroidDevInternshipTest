package com.example.testsmartconseilapp.fragments

import ControlAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testsmartconseilapp.HomeActivity
import com.example.testsmartconseilapp.R
import com.example.testsmartconseilapp.databinding.FragmentPhoneUsageBinding
import com.example.testsmartconseilapp.model.App


class PhoneUsageFragment : Fragment() {
    lateinit var adapter1: ControlAdapter
    lateinit var mainView: FragmentPhoneUsageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainView = FragmentPhoneUsageBinding.inflate(layoutInflater)
        return mainView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerViews()
       (activity as HomeActivity?)?.setTitle("Parental Control")

    }

    private fun setupRecyclerViews() {
        adapter1 = ControlAdapter(mutableListOf(
            App(R.drawable.google_img,true,"Google Chrome"),
            App(R.drawable.camera,false,"Camera"),
        ))
        mainView.rv.apply {
            adapter = adapter1
            layoutManager = LinearLayoutManager(activity)
        }

    }


}