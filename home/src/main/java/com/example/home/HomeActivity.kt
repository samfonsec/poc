package com.example.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class HomeActivity : AppCompatActivity() {

    private val button by lazy { findViewById<Button>(R.id.btLogin) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        button.setOnClickListener {
            Toast.makeText(this, "CHUPAAAA", Toast.LENGTH_LONG).show()
        }
    }
}