package com.example.chanakya.rxjavawithretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.chanakya.rxjavawithretrofit.model.CouponResponse;
import com.example.chanakya.rxjavawithretrofit.network.RetrofitInstance;
import com.example.chanakya.rxjavawithretrofit.network.CouponService;
import com.example.chanakya.rxjavawithretrofit.newmodel.StoreCoupons;


import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static java.lang.System.err;

public class MainActivity extends AppCompatActivity {

    @Inject
    Retrofit retrofit;
    public  static String baseUrl ="http://www.zoftino.com/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 /*       CouponService service  = retrofit.create(CouponService.class);

        Call<StoreCoupons> call =  service.getCouponT();

        call.enqueue(new Callback<StoreCoupons>() {
            @Override
            public void onResponse(Call<StoreCoupons> call, Response<StoreCoupons> response) {
                Log.e("newResponse",response.body().toString());
            }

            @Override
            public void onFailure(Call<StoreCoupons> call, Throwable t) {

            }
        });*/

     /*   CouponService service  = RetrofitInstance.getRetrofitInstance().create(CouponService.class);

       Observable<CouponResponse> call = service.getCoupon();

        call.enqueue(new Callback<CouponResponse>() {
            @Override
            public void onResponse(Call<CouponResponse> call, StoreResponse<CouponResponse> response) {

            }

            @Override
            public void onFailure(Call<CouponResponse> call, Throwable t) {

            }
        });*/


        //Retrofit call using RxJava

 /*     RetrofitInstance.getRetrofitInstance().create(CouponService.class)
              .getCoupon()
              .subscribeOn(Schedulers.io())
              .observeOn(AndroidSchedulers.mainThread())
              .subscribe(new Observer<CouponResponse>() {
                  @Override
                  public void onSubscribe(Disposable d) {

                  }

                  @Override
                  public void onNext(CouponResponse couponResponse) {

                  }

                  @Override
                  public void onError(Throwable e) {

                  }

                  @Override
                  public void onComplete() {

                  }
              });*/


        Object predicate;
        RetrofitInstance.getRetrofitInstance().create(CouponService.class)
                .getCoupon()
                .retryWhen(errors -> errors
                        .filter(throwable -> throwable instanceof RuntimeException)
                        .zipWith(Observable.range(1, 3), (throwable, retryCount) -> {
                            Log.i("lol", "retry " + retryCount);
                            return retryCount;
                        }))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleResults,this::handleError);


        RetrofitInstance.getRetrofitInstance().create(CouponService.class)
                .getStoreDetails()
                .retryWhen(errors -> errors
                        .filter(throwable -> throwable instanceof RuntimeException)
                        .zipWith(Observable.range(1, 3), (throwable, retryCount) -> {
                            Log.i("lol", "retry " + retryCount);
                            return retryCount;
                        }))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleResults,this::handleError);




    }



    private void handleError(Throwable throwable) {
        Log.e("chanakya","hello");
        Log.e("error",throwable.getMessage());
    }

    private void handleResults(StoreCoupons storeCoupons) {

         Log.e("result",storeCoupons.getMaxCashback());
    }


}
