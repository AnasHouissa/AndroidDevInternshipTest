package com.example.testsmartconseilapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testsmartconseilapp.databinding.ActivityAddChildBinding

class AddChildActivity : AppCompatActivity() {
    private lateinit var mainView: ActivityAddChildBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainView = ActivityAddChildBinding.inflate(layoutInflater)
        setContentView(mainView.root)

        mainView.btnNext.setOnClickListener {
            Intent(this,CongratsActivity::class.java).also { startActivity(it) }
        }
        mainView.btnSkip.setOnClickListener {
            Intent(this,CongratsTwoActivity::class.java).also { startActivity(it) }
        }
    }
}