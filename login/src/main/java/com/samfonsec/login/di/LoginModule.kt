package com.samfonsec.login.data

import org.koin.dsl.module

class LoginModule {

    val loginModule = module {
        single<LoginRepository> { LoginDataStore() }
    }
}