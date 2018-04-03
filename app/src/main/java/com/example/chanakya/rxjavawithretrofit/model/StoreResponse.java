package com.example.chanakya.rxjavawithretrofit.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class StoreResponse {

	@SerializedName("totalCoupons")
	private String totalCoupons;

	@SerializedName("maxCashback")
	private String maxCashback;

	@SerializedName("store")
	private String store;

	@SerializedName("topCoupons")
	private List<String> topCoupons;

	@SerializedName("cashback")
	private List<String> cashback;

	public void setTotalCoupons(String totalCoupons){
		this.totalCoupons = totalCoupons;
	}

	public String getTotalCoupons(){
		return totalCoupons;
	}

	public void setMaxCashback(String maxCashback){
		this.maxCashback = maxCashback;
	}

	public String getMaxCashback(){
		return maxCashback;
	}

	public void setStore(String store){
		this.store = store;
	}

	public String getStore(){
		return store;
	}

	public void setTopCoupons(List<String> topCoupons){
		this.topCoupons = topCoupons;
	}

	public List<String> getTopCoupons(){
		return topCoupons;
	}

	public void setCashback(List<String> cashback){
		this.cashback = cashback;
	}

	public List<String> getCashback(){
		return cashback;
	}

	@Override
 	public String toString(){
		return 
			"StoreResponse{" +
			"totalCoupons = '" + totalCoupons + '\'' + 
			",maxCashback = '" + maxCashback + '\'' + 
			",store = '" + store + '\'' + 
			",topCoupons = '" + topCoupons + '\'' + 
			",cashback = '" + cashback + '\'' + 
			"}";
		}
}