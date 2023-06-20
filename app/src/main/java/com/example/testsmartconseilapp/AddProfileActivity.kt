package com.example.testsmartconseilapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.testsmartconseilapp.databinding.ActivityAddProfileBinding

class AddProfileActivity : AppCompatActivity() {
    private lateinit var mainView : ActivityAddProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainView= ActivityAddProfileBinding.inflate(layoutInflater)
        setContentView(mainView.root)

        mainView.btnNext.setOnClickListener {
            Intent(this,ConfirmProfileActivity::class.java).also { startActivity(it) }
        }
        mainView.btnSkip.setOnClickListener {
            Intent(this,CongratsTwoActivity::class.java).also { startActivity(it) }
        }

        setupLangSpinner()

    }


    private fun setupLangSpinner() {
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(
            this,
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            listOf("Facebook", "Instagram","Twitter")
        )
        mainView.spinner.adapter = adapter


    }
}