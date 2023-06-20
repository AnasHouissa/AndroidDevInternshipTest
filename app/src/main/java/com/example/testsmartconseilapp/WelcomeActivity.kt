package com.example.testsmartconseilapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testsmartconseilapp.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var mainView:ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainView= ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(mainView.root)

        mainView.btnStart.setOnClickListener {
            Intent(this,AddDeviceActivity::class.java).also { startActivity(it) }
        }
    }
}