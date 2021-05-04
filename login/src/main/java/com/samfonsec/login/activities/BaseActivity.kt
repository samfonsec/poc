package com.samfonsec.login.activities

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import org.koin.android.viewmodel.ext.android.getViewModel
import java.lang.reflect.ParameterizedType
import kotlin.reflect.KClass

open class BaseActivity<V: Int, M : ViewModel> : AppCompatActivity() {

    val viewModel: M by lazy { getViewModel(clazz = viewModelClass()) }

    @Suppress("UNCHECKED_CAST")
    private fun viewModelClass(): KClass<M> {
        return ((javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[1] as Class<M>).kotlin
    }
}