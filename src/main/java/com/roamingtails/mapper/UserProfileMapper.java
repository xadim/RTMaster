package com.roamingtails.mapper;

import java.io.IOException;
import java.net.UnknownHostException;

import com.roamingtails.model.Address;
import com.roamingtails.model.PetProfile;
import com.roamingtails.model.UserProfile;
import com.roamingtails.model.request.PetProfileRequest;
import com.roamingtails.model.request.UserProfileRequest;

public class UserProfileMapper {

	public UserProfile mapUserProfileRequest(UserProfileRequest request) throws IOException {
		Address add = new Address();
		
		add.setAddress1(request.getAddress1());
		add.setApt(request.getApt());
		add.setCity(request.getCity());
		add.setState(request.getState());
		add.setZipCode(request.getZipCode());
		UserProfile user = new UserProfile(request.getEmailId(),request.getFirstName(),request.getLastName(),request.getPassword(),add,request.getPhoneNumber(),request.getMobilenumber(),request.getPetList());
		try {
			user.setImageFileUrl(user.saveImage(request.getImageFileUrl()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	public UserProfile updateProfile(UserProfile profile, UserProfile updatedProfile) throws UnknownHostException {
		//profile.setUsername(updatedProfile.getUsername());
		profile.setFirstName(updatedProfile.getFirstName());
		profile.setLastName(updatedProfile.getLastName());
		profile.setEmailId(updatedProfile.getEmailId());
		profile.setPassword(updatedProfile.getPassword());		
		profile.setImageFileUrl(updatedProfile.getImageFileUrl());
		profile.setPhoneNumber(updatedProfile.getPhoneNumber());
		profile.setMobilenumber(updatedProfile.getMobilenumber());
		profile.setAdd(updatedProfile.getAdd());
		return profile;
	}
	
	public PetProfile mapPetProfile(PetProfileRequest request) throws IOException {
		PetProfile pet = new PetProfile();
		Address add = new Address();
		//PetProfile pet = new PetProfile();
		add.setAddress1(request.getAddress1());
		add.setApt(request.getApt());
		add.setCity(request.getCity());
		add.setState(request.getState());
		add.setZipCode(request.getZipCode());		
		pet.setPetName(request.getPetName());
		pet.setPetType(request.getPetType());
		pet.setBirthDay(request.getBirthDay());
		pet.setPetBreed(request.getPetBreed());
		pet.setPetColor(request.getPetColor());
		pet.setVetName(request.getVetName());
		pet.setVetNumber(request.getVetNumber());
		pet.setBeaconId(request.getBeaconId());
		pet.setPetProfileImage(pet.saveImage(request.getPetProfileUrl()));
		pet.setAdd(add);		
		return pet;		
	}

}
