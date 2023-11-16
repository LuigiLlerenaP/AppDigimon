package com.example.app_conection.conections;

import static com.example.app_conection.MainActivity.Url;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitlnstance {
    public static RetroFitlnstance instance;
    private ApiInterface apiInterface;

     RetroFitlnstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface.class);
    }
    public static  RetroFitlnstance getInst(){
         if ( instance==null){
             instance = new RetroFitlnstance();
         }
        return instance;

    }
    public ApiInterface getApiI(){
         return apiInterface;
     }
}