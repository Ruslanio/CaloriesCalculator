package com.production.ruslanio.caloriescalculator.views

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Ruslanio on 07.02.2018.
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(2000)
        redirect()
    }

    fun redirect() {
        startActivity(Intent(this, UserFormActivity::class.java))
        finish()
    }
}