package com.example.umc_careever

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.umc_careever.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginSignInBtn.setOnClickListener {
            startActivity(Intent(this, UserCheckActivity::class.java))


            finish();
        }
    }
}