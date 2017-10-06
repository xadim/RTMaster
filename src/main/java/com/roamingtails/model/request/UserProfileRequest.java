package com.roamingtails.model.request;

import java.util.ArrayList;

import com.roamingtails.model.PetProfile;

public class UserProfileRequest {
//	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String emailId;
	private String address1;
	private String apt;
	private String city;
	private String state;
	private String zipCode;
	private long phoneNumber;
	private long mobilenumber;
	private String imageFileUrl;
	private ArrayList< PetProfile > petList = new ArrayList< PetProfile >();
	private String authToken;
	
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
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getImageFileUrl() {
		return imageFileUrl;
	}
	public void setImageFileUrl(String imageFileUrl) {
		this.imageFileUrl = imageFileUrl;
	}

	
	
	@Override
	public String toString() {
		return "UserProfileRequest [password=" + password + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", address1=" + address1 + ", apt=" + apt + ", city=" + city + ", state="
				+ state + ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber + ", mobilenumber=" + mobilenumber
				+ ", imageFileUrl=" + imageFileUrl + "]";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public ArrayList< PetProfile > getPetList() {
		return petList;
	}
	public void setPetList(ArrayList< PetProfile > petList) {
		this.petList = petList;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	
	
}
