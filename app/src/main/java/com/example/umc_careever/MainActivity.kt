package com.example.umc_careever

import android.content.Intent

import android.os.Bundle
import android.view.MenuItem
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import com.example.umc_careever.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBottomNavigation()


    }

    private fun initBottomNavigation() {

        supportFragmentManager.beginTransaction()
            .replace(R.id.main_frm, HomeFragment())
            .commitAllowingStateLoss()

        binding.bottomMenu.setOnNavigationItemSelectedListener{item ->
            when (item.itemId) {
                R.id.first_tab -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, HomeFragment())
                        .commitAllowingStateLoss()
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.second_tab -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, ServiceStateFragment())
                        .commitAllowingStateLoss()
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.third_tab -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, ChatFragment())
                        .commitAllowingStateLoss()
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.fourth_tab -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, MyFragment())
                        .commitAllowingStateLoss()
                    return@setOnNavigationItemSelectedListener true
                }

            }
            false
        }
    }



}

