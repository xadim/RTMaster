package com.roamingtails.model.request;


import com.roamingtails.model.Address;

public class PetProfileRequest {

	private String petName;
	private String petType;
	private String birthDay;	
	private String petBreed;
	private String petColor;
	private String vetName;
	private long vetNumber;
	private String petProfileUrl;
	private Address add = new Address();
	private String beaconId; 
	private String address1;
	private String apt;
	private String city;
	private String state;
	private String zipCode;
	
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getPetBreed() {
		return petBreed;
	}
	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}
	public String getPetColor() {
		return petColor;
	}
	public void setPetColor(String petColor) {
		this.petColor = petColor;
	}
	public String getVetName() {
		return vetName;
	}
	public void setVetName(String vetName) {
		this.vetName = vetName;
	}
	public long getVetNumber() {
		return vetNumber;
	}
	public void setVetNumber(long vetNumber) {
		this.vetNumber = vetNumber;
	}
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public String getBeaconId() {
		return beaconId;
	}
	public void setBeaconId(String beaconId) {
		this.beaconId = beaconId;
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
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPetProfileUrl() {
		return petProfileUrl;
	}
	public void setPetProfileUrl(String petProfileUrl) {
		this.petProfileUrl = petProfileUrl;
	}

	
}
