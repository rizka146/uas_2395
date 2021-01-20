package com.rizka2395.githubuserapi.api

import com.rizka2395.githubuserapi.data.model.DetailUserResponse
import com.rizka2395.githubuserapi.data.model.User
import com.rizka2395.githubuserapi.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token c675c69d8d245793bfc65b7383da41ba192ca9a0")
    fun getSearchUsers(
        @Query("q")query : String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token c675c69d8d245793bfc65b7383da41ba192ca9a0")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token c675c69d8d245793bfc65b7383da41ba192ca9a0")
    fun getFollowers(
        @Path("username") username : String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token c675c69d8d245793bfc65b7383da41ba192ca9a0")
    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>
}