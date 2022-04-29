package com.leo.practicewithplaceholder.presentation.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.leo.practicewithplaceholder.data.network.model.user.UserModel
import com.leo.practicewithplaceholder.data.repositoryImpl.UserRepositoryImpl
import com.leo.practicewithplaceholder.domain.usecase.users.GetAllUsersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private val userRepository: UserRepositoryImpl) :
    ViewModel() {

    private val getUser = GetAllUsersUseCase(userRepository)

    fun getAllUser(): LiveData<UserModel> {
        val data = MutableLiveData<UserModel>()
        viewModelScope.launch {
            data.value = getUser.execute()
            Log.e("TAG", "getAllUser: ${data.value}")
        }
        return data
    }
}