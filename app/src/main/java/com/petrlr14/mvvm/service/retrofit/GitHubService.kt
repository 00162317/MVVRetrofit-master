package com.petrlr14.mvvm.service.retrofit

import com.petrlr14.mvvm.database.entities.GitHubRepo
import retrofit2.http.GET

interface GitHubService {

    @GET("/users/{user}/repos")
    fun getRepos(user:String): List<GitHubRepo>
}