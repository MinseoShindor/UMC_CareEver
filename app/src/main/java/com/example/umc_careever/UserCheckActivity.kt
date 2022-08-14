package com.example.umc_careever

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
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
            binding.btnCheckUserHelp.setBackgroundResource(R.drawable.background_user_check_btn)
            binding.btnCheckUserHelpTv.setTextColor(Color.parseColor("#ffffff"))
            binding.checkExplainTv.visibility = View.VISIBLE
            binding.bannerTextTailHelp.visibility = View.VISIBLE
            binding.bannerTextTailManager.visibility = View.INVISIBLE
            binding.checkExplainTv.setText("봉사자가 하는 일 설명");

            binding.btnCheckUserManager.setBackgroundResource(R.drawable.btn_usercheck_help)
            binding.btnCheckUserManagerTv.setTextColor(Color.parseColor("#ff9624"))
        }

        binding.btnCheckUserManager.setOnClickListener {
            binding.checkExplainTv.visibility = View.VISIBLE
            binding.bannerTextTailManager.visibility = View.VISIBLE
            binding.bannerTextTailHelp.visibility = View.INVISIBLE
            binding.checkExplainTv.setText("매니저가 하는 일 설명");
            binding.btnCheckUserManager.setBackgroundResource(R.drawable.background_user_check_btn)
            binding.btnCheckUserManagerTv.setTextColor(Color.parseColor("#ffffff"))

            binding.btnCheckUserHelp.setBackgroundResource(R.drawable.btn_usercheck_help)
            binding.btnCheckUserHelpTv.setTextColor(Color.parseColor("#ff9624"))

        }



        binding.btnCheckUserNextActivity.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }


    }


}

