package com.example.chanakya.rxjavawithretrofit.model;


import com.google.gson.annotations.SerializedName;


public class CouponsItem{

	@SerializedName("expiryDate")
	private String expiryDate;

	@SerializedName("coupon")
	private String coupon;

	@SerializedName("store")
	private String store;

	@SerializedName("category")
	private String category;

	@SerializedName("couponCode")
	private String couponCode;

	public void setExpiryDate(String expiryDate){
		this.expiryDate = expiryDate;
	}

	public String getExpiryDate(){
		return expiryDate;
	}

	public void setCoupon(String coupon){
		this.coupon = coupon;
	}

	public String getCoupon(){
		return coupon;
	}

	public void setStore(String store){
		this.store = store;
	}

	public String getStore(){
		return store;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setCouponCode(String couponCode){
		this.couponCode = couponCode;
	}

	public String getCouponCode(){
		return couponCode;
	}

	@Override
 	public String toString(){
		return 
			"CouponsItem{" + 
			"expiryDate = '" + expiryDate + '\'' + 
			",coupon = '" + coupon + '\'' + 
			",store = '" + store + '\'' + 
			",category = '" + category + '\'' + 
			",couponCode = '" + couponCode + '\'' + 
			"}";
		}
}