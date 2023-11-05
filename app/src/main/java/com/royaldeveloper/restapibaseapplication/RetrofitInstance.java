package com.royaldeveloper.restapibaseapplication;



import static com.royaldeveloper.restapibaseapplication.MainActivity.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    public  static  RetrofitInstance instance;
    ApiInterface apiInterface;
    RetrofitInstance(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(api)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiInterface=retrofit.create(ApiInterface.class); // retrofit build
    }
    public static RetrofitInstance getInstance(){
        if (instance==null){
            instance=new RetrofitInstance();
        }
        return instance;
    }

}
