package com.roamingtails.model.response;

public class RestaurantResponse {
	
	private String restId;
	private String restName;	
	private String phoneNumber;
	private String restWebsite;
	private String restEmailId;
	private int restNosPetAllowed;
	private String restPetWeightAllowed;
	private String restFeesSruct;
	private String address1;
	private String apt;
	private String city;
	private String state;
	private int zipCode;
	
	public String getRestId() {
		return restId;
	}
	public void setRestId(String restId) {
		this.restId = restId;
	}
	public String getRestName() {
		return restName;
	}
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getRestWebsite() {
		return restWebsite;
	}
	public void setRestWebsite(String restWebsite) {
		this.restWebsite = restWebsite;
	}
	public String getRestEmailId() {
		return restEmailId;
	}
	public void setRestEmailId(String restEmailId) {
		this.restEmailId = restEmailId;
	}
	public int getRestNosPetAllowed() {
		return restNosPetAllowed;
	}
	public void setRestNosPetAllowed(int restNosPetAllowed) {
		this.restNosPetAllowed = restNosPetAllowed;
	}
	public String getRestPetWeightAllowed() {
		return restPetWeightAllowed;
	}
	public void setRestPetWeightAllowed(String restPetWeightAllowed) {
		this.restPetWeightAllowed = restPetWeightAllowed;
	}
	public String getRestFeesSruct() {
		return restFeesSruct;
	}
	public void setRestFeesSruct(String restFeesSruct) {
		this.restFeesSruct = restFeesSruct;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getApt() {
		return apt;
	}
	public void setApt(String apt) {
		this.apt = apt;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	private String latitude;
	private String Longitude;	
	
}
