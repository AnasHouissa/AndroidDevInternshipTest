package com.example.testsmartconseilapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testsmartconseilapp.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var mainView: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainView = ActivitySignUpBinding.inflate(layoutInflater)

        setContentView(mainView.root)

        mainView.btnSigin.setOnClickListener {
            Intent(this,SignInWithEmailActivity::class.java).also { startActivity(it) }
        }
    }
}