package com.example.testsmartconseilapp.fragments

import AlertsAdapter
import SocialMediaActivitesAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testsmartconseilapp.HomeActivity
import com.example.testsmartconseilapp.R
import com.example.testsmartconseilapp.databinding.ActivityHomeBinding
import com.example.testsmartconseilapp.databinding.FragmentDashboardBinding
import com.example.testsmartconseilapp.model.Alert
import com.example.testsmartconseilapp.model.SmActivitiy

class DashboardFragment : Fragment() {
    lateinit var adapter1: AlertsAdapter
    lateinit var adapter2: SocialMediaActivitesAdapter
    lateinit var mainView: FragmentDashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainView = FragmentDashboardBinding.inflate(layoutInflater)
        return mainView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerViews()
        (activity as HomeActivity?)?.setTitle("Child first name")

    }

    private fun setupRecyclerViews() {
        adapter1 = AlertsAdapter(mutableListOf(
            Alert("Toxic comment!","Mama always said life was like a box of chocolates. You never know what…","12:34 PM"),
            Alert("Sleep depreviation!","Mama always said life was like a box of chocolates. You never know what…","12:34 PM"),
        ))
        mainView.rvAlert.apply {
            adapter = adapter1
            layoutManager = LinearLayoutManager(activity)
        }
        adapter2 = SocialMediaActivitesAdapter(mutableListOf(
            SmActivitiy("Rebecca Morgan","Mama always said life was like a box of chocolates. You never know what…","12:34 PM",R.drawable.profile_two),
            SmActivitiy("Justin Holmes","You don't understand! I coulda had class. I coulda been a contender. I could've…","13:11 PM",R.drawable.profile_one),
        ))
        mainView.rvSocial.apply {
            adapter = adapter2
            layoutManager = LinearLayoutManager(activity)
        }
    }
}