package com.noti0ns.githubrepolist.data.repositories

import com.noti0ns.githubrepolist.data.models.GithubDeviceCodeResponse

interface GithubRepository {
    suspend fun requestDeviceCode(clientId: String) : GithubDeviceCodeResponse
}