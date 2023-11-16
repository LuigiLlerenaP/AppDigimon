package com.example.app_conection.conections;

import com.example.app_conection.model.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("digimon")
    Call<List<Model>> getM();
}
