package com.example.specialdayreminder

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class SplashScreenActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val view: LinearLayout = findViewById(R.id.splashScreenLL)
        view.setOnTouchListener { _, _ ->
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            true
        }
    }
}