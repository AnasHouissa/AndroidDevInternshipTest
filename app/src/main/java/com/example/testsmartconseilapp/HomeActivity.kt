package com.example.testsmartconseilapp

import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.testsmartconseilapp.databinding.ActivityHomeBinding
import com.example.testsmartconseilapp.fragments.DashboardFragment
import com.example.testsmartconseilapp.fragments.PhoneUsageFragment


class HomeActivity : AppCompatActivity() {
    private lateinit var mainView: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainView = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(mainView.root)



        replaceFragment(DashboardFragment())

        mainView.bottomNavigation.btnPhoneusage.setOnClickListener {
            replaceFragment(PhoneUsageFragment())
            setIconsColors(mainView.bottomNavigation.btnPhoneusage)
        }
        mainView.bottomNavigation.btnAlerts.setOnClickListener {
            Toast.makeText(this, "Not available", Toast.LENGTH_SHORT).show()
        }
        mainView.bottomNavigation.btnSocialmedia.setOnClickListener {
            Toast.makeText(this, "Not available", Toast.LENGTH_SHORT).show()

        }
        mainView.bottomNavigation.btnDashboard.setOnClickListener {
            replaceFragment(DashboardFragment())
            setIconsColors(mainView.bottomNavigation.btnDashboard)

        }

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    private fun setIconsColors(button: Button) {

        mainView.bottomNavigation.btnDashboard.setTextColor(
            ContextCompat.getColor(
                this,
                if (button == mainView.bottomNavigation.btnDashboard) R.color.white else R.color.purple
            )
        )
        mainView.bottomNavigation.btnDashboard.setBackgroundColor(
            ContextCompat.getColor(
                this,
                if (button == mainView.bottomNavigation.btnDashboard) R.color.blue else R.color.transparent
            )
        )
        val drawablebtnDashboard = mainView.bottomNavigation.btnDashboard.compoundDrawables[1].mutate()
        drawablebtnDashboard.colorFilter = PorterDuffColorFilter(
            ContextCompat.getColor(this, if (button == mainView.bottomNavigation.btnDashboard) R.color.white else R.color.purple),
            PorterDuff.Mode.SRC_IN
        )
        mainView.bottomNavigation.btnDashboard.setCompoundDrawables(null, drawablebtnDashboard, null, null)




        mainView.bottomNavigation.btnPhoneusage.setTextColor(
            ContextCompat.getColor(
                this,
                if (button == mainView.bottomNavigation.btnPhoneusage) R.color.white else R.color.purple
            )
        )
        mainView.bottomNavigation.btnPhoneusage.setBackgroundColor(
            ContextCompat.getColor(
                this,
                if (button == mainView.bottomNavigation.btnPhoneusage) R.color.blue else R.color.transparent
            )
        )
        val drawablebtnPhoneusage = mainView.bottomNavigation.btnPhoneusage.compoundDrawables[1].mutate()
        drawablebtnPhoneusage.colorFilter = PorterDuffColorFilter(
            ContextCompat.getColor(this, if (button == mainView.bottomNavigation.btnPhoneusage) R.color.white else R.color.purple),
            PorterDuff.Mode.SRC_IN
        )
        mainView.bottomNavigation.btnPhoneusage.setCompoundDrawables(null, drawablebtnPhoneusage, null, null)

    }

    public fun setTitle(string:String){
        mainView.toolbarTitle.text=string
    }
}