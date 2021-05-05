package com.example.navigator.core

import android.content.Intent

internal object ClassRegistry {

    fun loadIntent(packageName: String, className: String): Intent =
        Intent(Intent.ACTION_VIEW).setClassName(packageName, className)
}