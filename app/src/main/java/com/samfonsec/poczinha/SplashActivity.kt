package com.samfonsec.poczinha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.samfonsec.login.activities.LoginActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_splash)
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
}


/*

app
login
checkout
security

*/