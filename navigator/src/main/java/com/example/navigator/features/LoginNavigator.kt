package com.example.navigator.features

import com.example.navigator.core.Navigator

object LoginNavigator : Navigator() {

    private const val LOGIN_MODULE = "com.samfonsec.login.activities.LoginActivity"
    fun login(packageName: String) = loadIntent(packageName, LOGIN_MODULE)
}