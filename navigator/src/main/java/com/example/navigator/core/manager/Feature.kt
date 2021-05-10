package com.example.navigator.core.manager

import android.content.Context
import android.content.Intent

interface Feature {

    fun getIntent(context: Context): Intent
}