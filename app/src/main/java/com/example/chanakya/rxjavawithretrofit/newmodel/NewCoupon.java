package com.example.chanakya.rxjavawithretrofit.newmodel;

/**
 * Created by chanakya on 3/9/2018.
 */

public class NewCoupon {

    private String store;
    private String coupon;
    private String expiryDate;
    private String couponCode;


    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
}
