package com.example.garai.noodlesapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.ActivityCompat.startActivity
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Window


class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler = Handler()
        handler.postDelayed(delayFunc, 2000)


    }

    val delayFunc = Runnable {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}


