package com.example.testsmartconseilapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testsmartconseilapp.databinding.ActivitySignInWithEmailBinding

class SignInWithEmailActivity : AppCompatActivity() {
    private lateinit var mainView: ActivitySignInWithEmailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainView = ActivitySignInWithEmailBinding.inflate(layoutInflater)

        setContentView(mainView.root)

        mainView.btnSignin.setOnClickListener {
            Intent(this,SpaceChooseActivity::class.java).also { startActivity(it) }

        }
    }
}