package com.example.den.githabapi;

import com.example.den.githabapi.entity.GitHubRepo;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface GitHubClientInterface {
    //to retrieve the repository
//    @GET("/users/{user}/repos")
//    Call<List<GitHubRepo>> repoUser(@Path("user") String user);

    //to retrieve the repository
    @GET
    Call<List<GitHubRepo>> repoUser(@Url String fileUrl);

    //get the list of organizations
    @GET
    Call<ResponseBody> getResponse(@Url String fileUrl);
}

