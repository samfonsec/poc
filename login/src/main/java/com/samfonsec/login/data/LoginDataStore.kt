package com.samfonsec.login.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class LoginDataStore : LoginRepository {

    override suspend fun login(user: String, password: String): Boolean {
        delay(2000)
        return withContext(Dispatchers.IO) {
            password == "1234"
        }
    }
}