package com.noti0ns.githubrepolist.data.repositories

import com.noti0ns.githubrepolist.data.models.GithubDeviceCodeResponse

class GithubRepositoryImpl : GithubRepository {
    override suspend fun requestDeviceCode(clientId: String): GithubDeviceCodeResponse {
        TODO("Not yet implemented")
    }
}