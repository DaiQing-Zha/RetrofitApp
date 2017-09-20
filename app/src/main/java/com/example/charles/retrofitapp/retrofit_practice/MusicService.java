package com.example.charles.retrofitapp.retrofit_practice;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by charles on 9/19/17.
 */

public interface MusicService {
    @GET("awake/inter/getSongLabel")
    Call<MusicBean> getMusic(@Query("appid") String appid);
}
