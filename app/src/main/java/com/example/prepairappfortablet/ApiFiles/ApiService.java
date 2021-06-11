package com.example.prepairappfortablet.ApiFiles;

import com.example.prepairappfortablet.LoginFiles.LoginRequest;
import com.example.prepairappfortablet.LoginFiles.LoginResponse;
import com.example.prepairappfortablet.RegisterFiles.RegisterRequest;
import com.example.prepairappfortablet.RegisterFiles.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("/auth/login")
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);

    @POST("/auth/register")
    Call<RegisterResponse> registerUser(@Body RegisterRequest registerRequest);

}
