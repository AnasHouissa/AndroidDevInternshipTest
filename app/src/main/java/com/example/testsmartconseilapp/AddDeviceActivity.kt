package com.example.testsmartconseilapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testsmartconseilapp.databinding.ActivityAddDeviceBinding

class AddDeviceActivity : AppCompatActivity() {
    private lateinit var mainView :ActivityAddDeviceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainView= ActivityAddDeviceBinding.inflate(layoutInflater)
        setContentView(mainView.root)

        mainView.btnNext.setOnClickListener {
            Intent(this,AddProfileActivity::class.java).also { startActivity(it) }
        }
        mainView.btnSkip.setOnClickListener {
            Intent(this,CongratsTwoActivity::class.java).also { startActivity(it) }
        }
    }
}