package com.example.chanakya.rxjavawithretrofit.network;

import com.example.chanakya.rxjavawithretrofit.model.CouponResponse;
import com.example.chanakya.rxjavawithretrofit.model.StoreResponse;
import com.example.chanakya.rxjavawithretrofit.newmodel.StoreCoupons;


import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by chanakya on 3/9/2018.
 */


public interface CouponService {


    @GET("coupons")
    Call<StoreCoupons> getCouponT();

    @GET("coupons")
    Observable<StoreCoupons> getCoupon();



    @GET("storeOffers")
    Observable<StoreCoupons> getStoreDetails();



}
