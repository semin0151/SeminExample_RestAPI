package com.example.restapiexample;

import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.jaxb.JaxbConverterFactory;

public class RetrofitClient {
    private static RetrofitClient instance = null;
    private static RetrofitInterface retrofitInterface;
    private static String baseUrl = "http://apis.data.go.kr/";

    private RetrofitClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                .build();
        retrofitInterface = retrofit.create(RetrofitInterface.class);
    }

    public static RetrofitClient getInstance(){
        if(instance == null){
            instance = new RetrofitClient();
        }
        return instance;
    }

    public static RetrofitInterface getRetrofitInterface() {
        return retrofitInterface;
    }
}
