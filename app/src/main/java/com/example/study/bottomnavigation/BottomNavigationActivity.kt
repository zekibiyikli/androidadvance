package com.example.study.bottomnavigation

import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.study.databinding.ActivityBottomNavigationBinding
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationItemView

import android.view.LayoutInflater
import android.widget.TextView
import com.example.study.R

class BottomNavigationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBottomNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_fragment)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_bottom1,
                R.id.navigation_bottom2,
                R.id.navigation_bottom3
            )
        )
        navView.setupWithNavController(navController)
        initBadge()
    }

    fun initBadge(){
        val mbottomNavigationMenuView = binding.navView.getChildAt(0) as BottomNavigationMenuView
        val view: View = mbottomNavigationMenuView.getChildAt(1)
        val itemView = view as BottomNavigationItemView
        val cart_badge: View = LayoutInflater.from(this).inflate(
                R.layout.badge_bottomnavigation,
                mbottomNavigationMenuView, false)
        (cart_badge.findViewById<View>(R.id.bottomnavigationBadge) as TextView).text = "5"
        itemView.addView(cart_badge);
    }
}