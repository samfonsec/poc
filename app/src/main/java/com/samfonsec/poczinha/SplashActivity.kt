package com.samfonsec.poczinha

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigator.features.LoginNavigator

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_splash)
        navigateToLogin()
    }

    private fun navigateToLogin() {
        startActivity(LoginNavigator.navigate(this))
    }
}