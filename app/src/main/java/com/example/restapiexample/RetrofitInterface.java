package com.example.restapiexample;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {
    String MyKey = "J1uWhMdL85rUtm1%2FogRUgAehBm4pAZ2QJBmZ8ytsj9q5VPkKoPyTuUWItYfi5LAXgTA%2Bmn2ERVnNZDQsfwYxpg%3D%3D";
    //
    @GET("1360000/VilageFcstInfoService/getUltraSrtNcst?serviceKey="+MyKey)
    Call<Result> getWeather(@Query("pageNo") int pageNo,
                            @Query("numOfRows") int numOfRows,
                            @Query("dataType") String dataType,
                            @Query("base_date") String base_date,
                            @Query("base_time") String base_time,
                            @Query("nx") int nx,
                            @Query("ny") int ny);
}
