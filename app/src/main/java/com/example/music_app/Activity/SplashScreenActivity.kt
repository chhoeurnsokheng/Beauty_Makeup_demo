package com.example.music_app.Activity
/**
 *Created by Sokheng :12/21/2020
 * **/
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.music_app.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()
        android.os.Handler().postDelayed(
            {
                startActivity(Intent(this, MainActivity::class.java))
            },
            3000
        )
    }
}
