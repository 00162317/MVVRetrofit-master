package com.petrlr14.mvvm.service.retrofit

import com.petrlr14.mvvm.database.entities.GitHubRepo

interface GitHubService {

    fun getRepos(user:String): List<GitHubRepo>
}