package com.example.navigator.core

import android.content.Context
import android.content.Intent

internal object ClassRegistry {
    fun getIntent(context: Context, className: String) = Intent().setClassName(context, className)
}