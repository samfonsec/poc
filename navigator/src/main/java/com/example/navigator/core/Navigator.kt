package com.example.navigator.core

import android.content.Context
import android.content.Intent

interface NavigatorProvider {
    fun navigate(context: Context): Intent
}

fun NavigatorProvider.getIntentForClassName(context: Context, className: String) =
    Intent().setClassName(context, className)