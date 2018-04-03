package com.example.chanakya.rxjavawithretrofit.network;

import com.example.chanakya.rxjavawithretrofit.newmodel.StoreCoupons;

import javax.inject.Singleton;

import dagger.Component;
import io.reactivex.Observable;
import retrofit2.Retrofit;

/**
 * Created by chanakya on 4/1/2018.
 */

@Component(modules = {RetrofitInstance.class })
@Singleton
public interface RetrofitComponent {

    Retrofit getRetrofitInstance();


}
