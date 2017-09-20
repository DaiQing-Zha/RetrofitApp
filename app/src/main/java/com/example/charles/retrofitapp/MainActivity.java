package com.example.charles.retrofitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.charles.retrofitapp.retrofit_practice.MusicBean;
import com.example.charles.retrofitapp.retrofit_practice.MusicService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnRetrofit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testRetrofit();
            }
        });
    }

    /**
     * 测试Retrofit
     */
    private void testRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://139.129.213.70/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MusicService service = retrofit.create(MusicService.class);
        Call<MusicBean> callGetMusic = service.getMusic("e7cd6f1b8546234697b07a6d0231c507");
        callGetMusic.enqueue(new Callback<MusicBean>() {
            @Override
            public void onResponse(Call<MusicBean> call, Response<MusicBean> response) {
                if (response.isSuccess()) {
                    MusicBean result = response.body();
                    Log.e("MainActivity","result = " + result.toString());

                }
            }
            @Override
            public void onFailure(Call<MusicBean> call, Throwable t) {
                Log.e("MainActivity","throwable = " + t.getMessage());
            }
        });
    }
}
