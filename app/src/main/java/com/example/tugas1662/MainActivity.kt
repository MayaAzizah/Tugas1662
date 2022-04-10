package com.example.tugas1662

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.security.identity.AccessControlProfile
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.tugas1662.home.HomeFragment
import com.example.tugas1662.profile.ProfileFragment
import com.example.tugas1662.setting.SettingFragment

class MainActivity : AppCompatActivity() {
    private lateinit var  btnHome : Button
    private lateinit var  btnProfile : Button
    private lateinit var btnSetting : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome = findViewById(R.id.btnHome)
        btnProfile = findViewById(R.id.btnProfile)
        btnSetting = findViewById(R.id.btnSetting)

//        btnHome.setOnClickListener {
//            val intent = Intent(this, HomeActivity::class.java)
//            intent.putExtra("username", "maya")
//            startActivity(intent)
//
//        }

        btnHome.setOnClickListener {
            loadFragment(HomeFragment())
        }
        btnSetting.setOnClickListener {
            loadFragment(SettingFragment())
        }
        btnProfile.setOnClickListener {
            loadFragment(ProfileFragment())
        }
    }
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(com.google.android.material.R.id.container, fragment)
            .commitNow()
    }

}