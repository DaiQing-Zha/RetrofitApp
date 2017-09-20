package com.example.charles.retrofitapp;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.example.charles.retrofitapp.retrofit_practice.MusicBean;
import com.example.charles.retrofitapp.retrofit_practice.MusicService;

import org.junit.Test;
import org.junit.runner.RunWith;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.charles.retrofitapp", appContext.getPackageName());
    }

    @Test
    public void testRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://139.129.213.70/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MusicService service = retrofit.create(MusicService.class);
        //pageSize = 10,curPage=1
        Call<MusicBean> callGetMusic = service.getMusic();

        callGetMusic.enqueue(new Callback<MusicBean>() {
            @Override
            public void onResponse(Call<MusicBean> call, Response<MusicBean> response) {
                if (response.isSuccess()) {
                    MusicBean result = response.body();
                    System.out.println("result = " + result.toString());

                }
            }

            @Override
            public void onFailure(Call<MusicBean> call, Throwable t) {

            }
        });
    }
}
