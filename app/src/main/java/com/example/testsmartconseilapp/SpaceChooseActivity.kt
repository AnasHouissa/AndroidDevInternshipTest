package com.example.testsmartconseilapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testsmartconseilapp.databinding.ActivitySpaceChooseBinding

class SpaceChooseActivity : AppCompatActivity() {
    private lateinit var mainView: ActivitySpaceChooseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainView= ActivitySpaceChooseBinding.inflate(layoutInflater)
        setContentView(mainView.root)
        mainView.constraintLayout.setOnClickListener {
            Intent(this,WelcomeActivity::class.java).also { startActivity(it) }
        }
    }
}