package com.leo.practicewithplaceholder.domain.usecase.users

import com.leo.practicewithplaceholder.data.network.model.user.UserModel
import com.leo.practicewithplaceholder.domain.repository.UserRepository

class GetAllUsersUseCase(private val userRepository: UserRepository) {

    suspend fun execute(): UserModel {
        return userRepository.getAllUser()
    }
}