package com.example.chanakya.rxjavawithretrofit.newmodel;

import com.example.chanakya.rxjavawithretrofit.model.CouponsItem;

import java.util.List;

/**
 * Created by chanakya on 3/9/2018.
 */

public class StoreCoupons {

    private String store;
    private String totalCoupons ;
    private String maxCashback;
    private List<NewCoupon> coupons;

    public StoreCoupons(String store, String totalCoupons, String maxCashback, List<NewCoupon> coupons) {
        this.store = store;
        this.totalCoupons = totalCoupons;
        this.maxCashback = maxCashback;
        this.coupons = coupons;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getTotalCoupons() {
        return totalCoupons;
    }

    public void setTotalCoupons(String totalCoupons) {
        this.totalCoupons = totalCoupons;
    }

    public String getMaxCashback() {
        return maxCashback;
    }

    public void setMaxCashback(String maxCashback) {
        this.maxCashback = maxCashback;
    }

    public List<NewCoupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<NewCoupon> coupons) {
        this.coupons = coupons;
    }
}
