package com.example.ageofempire;

import com.example.ageofempire.model.RestAOEResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AOERestAPI {
    @GET("civilizations")
    Call<RestAOEResponse> getListAOE();
}
