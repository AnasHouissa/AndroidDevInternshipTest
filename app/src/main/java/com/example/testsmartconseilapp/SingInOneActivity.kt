package com.example.testsmartconseilapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testsmartconseilapp.databinding.ActivitySignInOneBinding

class SingInOneActivity : AppCompatActivity() {

    private lateinit var mainView: ActivitySignInOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainView = ActivitySignInOneBinding.inflate(layoutInflater)

        setContentView(mainView.root)

        mainView.clSignInEmail.setOnClickListener {
            Intent(this,SignInWithEmailActivity::class.java).also { startActivity(it) }

        }

        mainView.tvSignup.setOnClickListener {
            Intent(this,SignUpActivity::class.java).also { startActivity(it) }
        }
    }
}