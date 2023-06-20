package com.example.testsmartconseilapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testsmartconseilapp.databinding.ActivityCongratsBinding

class CongratsActivity : AppCompatActivity() {
    private lateinit var mainView: ActivityCongratsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainView = ActivityCongratsBinding.inflate(layoutInflater)
        setContentView(mainView.root)

        mainView.btnAddAnother.setOnClickListener {
            Intent(this,AddDeviceActivity::class.java).also { startActivity(it) }
        }
        mainView.btnContinue.setOnClickListener {
            Intent(this,CongratsTwoActivity::class.java).also { startActivity(it) }
        }
    }
}