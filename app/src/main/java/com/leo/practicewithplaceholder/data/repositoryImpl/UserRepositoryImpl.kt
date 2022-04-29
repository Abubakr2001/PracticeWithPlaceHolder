package com.leo.practicewithplaceholder.data.repositoryImpl

import com.leo.practicewithplaceholder.data.network.NetworkService
import com.leo.practicewithplaceholder.data.network.model.user.UserModel
import com.leo.practicewithplaceholder.domain.repository.UserRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepositoryImpl @Inject constructor(private val netService: NetworkService) :
    UserRepository {

    override suspend fun getAllUser(): UserModel {
        return netService.getAllUser()
    }
}