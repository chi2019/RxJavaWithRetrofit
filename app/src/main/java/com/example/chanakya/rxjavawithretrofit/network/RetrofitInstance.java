package com.example.chanakya.rxjavawithretrofit.network;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by chanakya on 3/9/2018.
 */


@Module
public class RetrofitInstance {

      public  static String baseUrl ="http://www.zoftono.com/api/";

  //  "http://www.zoftino.com/api/coupons";

    static Retrofit retrofit=null;

    @Provides
    public static Retrofit getRetrofitInstance(){

        retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();

        return  retrofit;
    }


}
