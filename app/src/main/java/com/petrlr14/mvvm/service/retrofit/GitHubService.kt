package com.petrlr14.mvvm.service.retrofit

import com.petrlr14.mvvm.database.entities.GitHubRepo
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {

    @GET("/users/{user}/repos")
    fun getRepos(@Path("user")user:String): Deferred<Response<List<GitHubRepo>>>

}