package com.example.bank1app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.bank1app.Fragment.OverviewFragment
import com.example.bank1app.Fragment.PaymentFragment
import com.example.bank1app.Fragment.SettingsFragment
import com.example.bank1app.Fragment.StatsFragment
import com.example.bank1app.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val overviewFragment = OverviewFragment()
        val paymentFragment = PaymentFragment()
        val statsFragment = StatsFragment()
        val settingsFragment = SettingsFragment()

        setCurrentFragment(overviewFragment)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.account_overview -> setCurrentFragment(overviewFragment)
                R.id.Payment -> setCurrentFragment(paymentFragment)
                R.id.Stats -> setCurrentFragment(statsFragment)
                R.id.Settings -> setCurrentFragment(settingsFragment)
            }
            true
        }

    }
    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flContainer,fragment)
            commit()
        }
}