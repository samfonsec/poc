package com.samfonsec.login

import android.app.Application
import com.samfonsec.login.di.loginModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class LoginApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@LoginApplication)
            modules(listOf(loginModule))
        }
    }
}