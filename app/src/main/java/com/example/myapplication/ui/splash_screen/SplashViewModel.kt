package com.example.myapplication.ui.splash_screen

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(private val authRepository: AuthRepository) : ViewModel() {
    fun getAuthToken(): Flow<String?> = authRepository.getToken()
}