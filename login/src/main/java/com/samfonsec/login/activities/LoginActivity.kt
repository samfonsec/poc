package com.samfonsec.login.activities

import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.core.view.isVisible
import androidx.databinding.ViewDataBinding
import com.example.navigator.features.HomeNavigator
import com.google.android.material.snackbar.Snackbar
import com.samfonsec.login.R
import com.samfonsec.login.di.LoginInitializer
import com.samfonsec.login.viewModels.LoginViewModel

class LoginActivity : BaseActivity<ViewDataBinding, LoginViewModel>() {

    private val button by lazy { findViewById<Button>(R.id.btLogin) }
    private val loading by lazy { findViewById<ProgressBar>(R.id.pbLoading) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_login)
        LoginInitializer.init()
        viewModel.onResult.observe(this, {
            hideLoading()
            val message = if (it) "Success!" else "Error!"
            Snackbar.make(findViewById(R.id.clParent), message, Snackbar.LENGTH_SHORT).show()
            navigateToHome()
        })

        button.setOnClickListener {
            showLoading()
            viewModel.login("user", "1234")
        }
    }

    private fun navigateToHome() {
        startActivity(HomeNavigator.navigate(this))
    }

    private fun showLoading() {
        loading.isVisible = true
        button.isVisible = false
    }

    private fun hideLoading() {
        loading.isVisible = false
        button.isVisible = true
    }
}