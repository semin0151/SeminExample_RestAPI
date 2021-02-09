package com.example.restapiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private TextView tv_weather;

    private String strDate;
    private String strTime;

    private RetrofitClient retrofitClient;
    private RetrofitInterface retrofitInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_weather = (TextView)findViewById(R.id.tv_weather);

        initDate();
        CallRetrofit();

    }

    public void initDate(){
        strDate = new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
        strTime = new SimpleDateFormat("HHmm").format(new Date(System.currentTimeMillis()));
        strTime = strTime.substring(0,1) + (char)((int)strTime.charAt(1)-1) + strTime.substring(2);
    }

    public void CallRetrofit(){
        try {
            retrofitClient = RetrofitClient.getInstance();
            retrofitInterface = RetrofitClient.getRetrofitInterface();

            retrofitInterface.getWeather(1,
                    8,
                    "JSON",
                    strDate,
                    strTime,
                    59,
                    122).enqueue(new Callback<Result>() {
                @Override
                public void onResponse(Call<Result> call, Response<Result> response) {
                    Result result = response.body();
                    List<Result.Response.Body.Items.Item> item = result.getResponse().getBody().getItems().getItem();
                    String str = "";
                    for(int i = 0; i < 4; i++){
                        str += new WeatherString(i,item.get(i).getObsrValue()).getStr();
                    }
                    tv_weather.setText(str);
                }

                @Override
                public void onFailure(Call<Result> call, Throwable t) {
                    tv_weather.setText(t.getMessage());
                }
            });

        }catch (Exception e){
            tv_weather.setText(e.getMessage());
        }
    }
}

