package com.roamingtails.model;



public class Address {
	
	
	private String address1;
	private String apt;
	private String city;
	private String state;
	private String zipCode;
	
	/*public Address(String address1, String apt, String city, String state, String zipCode) {
		this.address1 = address1;
		this.apt = apt;
		this.city =city;
		this.state = state;
		this.zipCode = zipCode;
	}*/
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
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	 
}
