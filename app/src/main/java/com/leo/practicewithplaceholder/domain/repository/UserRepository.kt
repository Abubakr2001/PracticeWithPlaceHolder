package com.leo.practicewithplaceholder.domain.repository

import com.leo.practicewithplaceholder.data.network.model.user.UserModel

interface UserRepository {

    suspend fun getAllUser(): UserModel
}