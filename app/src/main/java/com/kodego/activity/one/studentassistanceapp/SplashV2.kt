package com.kodego.activity.one.studentassistanceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashV2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_v2)

        CoroutineScope(Dispatchers.Main).launch {
            delay(5000L)
            startActivity(Intent(this@SplashV2, MainActivity::class.java))
            finish()
        }
    }
}