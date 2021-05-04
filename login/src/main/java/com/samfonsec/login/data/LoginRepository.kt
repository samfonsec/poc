package com.samfonsec.login.data

interface LoginRepository {
    suspend fun login(user: String, password: String): Boolean
}