package com.samfonsec.login.di

import com.samfonsec.login.data.LoginDataStore
import com.samfonsec.login.data.LoginRepository
import com.samfonsec.login.viewModels.LoginViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

val loginModule = module {
    single<LoginRepository> { LoginDataStore() }
    viewModel { LoginViewModel(get()) }
}

object LoginInitializer {
    fun init() = loadKoinModules(loginModule)
}