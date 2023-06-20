package com.example.testsmartconseilapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testsmartconseilapp.databinding.ActivityConfirmProfileBinding

class ConfirmProfileActivity : AppCompatActivity() {
    private lateinit var mainView: ActivityConfirmProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainView = ActivityConfirmProfileBinding.inflate(layoutInflater)
        setContentView(mainView.root)

        mainView.btnContinue.setOnClickListener {
            Intent(this, AddChildActivity::class.java).also { startActivity(it) }
        }
    }
}