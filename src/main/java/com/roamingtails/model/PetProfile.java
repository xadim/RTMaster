package com.roamingtails.model;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;



public class PetProfile {
	
	private String petName;
	private String petType;
	private String birthDay;	
	private String petBreed;
	private String petColor;
	private String vetName;
	private long vetNumber;
	private byte[] petProfileImage;
	private Address add = new Address();
	private String beaconId; 
	
	
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
	public byte[] getPetProfileImage() {
		return petProfileImage;
	}
	public void setPetProfileImage(byte[] petProfileImage) {
		this.petProfileImage = petProfileImage;
	}
	public byte[] saveImage(String filePath)throws IOException
	{
		// open image
		 File imgPath = new File(filePath);
		 BufferedImage bufferedImage = ImageIO.read(imgPath);

		 // get DataBufferBytes from Raster
		 WritableRaster raster = bufferedImage.getRaster();
		 DataBufferByte data = (DataBufferByte) raster.getDataBuffer();

		 return(data.getData());
	
	}
}
