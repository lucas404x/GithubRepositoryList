package com.noti0ns.githubrepolist.data.models

data class GithubDeviceCodeResponse(
    val userCode: String,
    val deviceCode: String,
    val verificationURL: String
)
