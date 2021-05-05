package com.samfonsec.poczinha

import android.content.Intent
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
//        val intent = Intent().setClassName(BuildConfig.APPLICATION_ID, LOGIN_MODULE)
//        val intent = Intent(this, Class.forName(LOGIN_MODULE))
//        startActivity(intent)
        startActivity(LoginNavigator.login(packageName))

    }
}

//private const val PACKAGE_NAME = "com.samfonsec"
//private const val LOGIN_MODULE = "$PACKAGE_NAME.login.activities.LoginActivity"