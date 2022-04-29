package com.leo.practicewithplaceholder.data.network

import com.leo.practicewithplaceholder.data.network.model.user.UserModel
import retrofit2.http.GET

interface NetworkService {

    @GET(Api.users)
    suspend fun getAllUser(): UserModel

}