package com.samfonsec.login.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.samfonsec.login.data.LoginRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel(private val loginRepository: LoginRepository) : ViewModel() {
    val onResult = MutableLiveData<Boolean>()

    fun login(user: String, password: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val result = loginRepository.login(user, password)
            onResult.postValue(result)
        }
    }
}