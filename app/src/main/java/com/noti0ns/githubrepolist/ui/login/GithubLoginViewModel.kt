package com.noti0ns.githubrepolist.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class GithubLoginViewModel : ViewModel() {
    private val _state : MutableLiveData<GithubLoginState> = MutableLiveData(GithubLoginState.Initial)
    val state : LiveData<GithubLoginState> = _state

   fun onGenerateLoginCode() = viewModelScope.launch {
       _state.value = GithubLoginState.GeneratingCode
   }

    sealed class GithubLoginState {
        data object Initial : GithubLoginState()
        data object GeneratingCode : GithubLoginState()
        data class CodeGenerated(val code: String, val verificationURL: String) : GithubLoginState()
        data class Error(val message: String) : GithubLoginState()
        data object Success : GithubLoginState()
    }

}