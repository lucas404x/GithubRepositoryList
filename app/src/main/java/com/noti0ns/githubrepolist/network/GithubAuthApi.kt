package com.noti0ns.githubrepolist.network

import com.noti0ns.githubrepolist.data.models.GithubDeviceCodeResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface GithubAuthApi {
    @FormUrlEncoded
    @POST("login/device/code")
    fun requestDeviceCode(@Field("client_id") clientId: String) : Call<GithubDeviceCodeResponse>
}