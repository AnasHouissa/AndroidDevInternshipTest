package com.example.testsmartconseilapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testsmartconseilapp.databinding.ActivityCongratsTwoBinding

class CongratsTwoActivity : AppCompatActivity() {
    private lateinit var mainView: ActivityCongratsTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainView = ActivityCongratsTwoBinding.inflate(layoutInflater)
        setContentView(mainView.root)

        mainView.btnGoDash.setOnClickListener {
            Intent(this,HomeActivity::class.java).also {
                startActivity(it) }
        }
    }
}