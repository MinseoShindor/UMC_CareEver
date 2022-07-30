package com.example.umc_careever

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.umc_careever.databinding.ActivityUsercheckBinding

class UserCheckActivity : AppCompatActivity() {

    lateinit var binding: ActivityUsercheckBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usercheck)

        binding = ActivityUsercheckBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.checkExplainTv.visibility = View.INVISIBLE
        binding.bannerTextTailHelp.visibility = View.INVISIBLE
        binding.bannerTextTailManager.visibility = View.INVISIBLE

        binding.btnCheckUserHelp.setOnClickListener {
            binding.checkExplainTv.visibility = View.VISIBLE
            binding.bannerTextTailHelp.visibility = View.VISIBLE
            binding.bannerTextTailManager.visibility = View.INVISIBLE
            binding.checkExplainTv.setText("봉사자가 하는 일 설명");
        }

        binding.btnCheckUserManager.setOnClickListener {
            binding.checkExplainTv.visibility = View.VISIBLE
            binding.bannerTextTailManager.visibility = View.VISIBLE
            binding.bannerTextTailHelp.visibility = View.INVISIBLE
            binding.checkExplainTv.setText("매니저가 하는 일 설명");
        }

        binding.btnCheckBtn1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}

