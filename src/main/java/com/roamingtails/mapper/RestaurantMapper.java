package com.roamingtails.mapper;

import com.roamingtails.model.Restaurants;
import com.roamingtails.model.response.RestaurantResponse;

public class RestaurantMapper {
	
	public RestaurantResponse mapRestResponse(Restaurants rest)
	{
		RestaurantResponse restRep = new RestaurantResponse();
		restRep.setRestId(rest.getRestId());
		restRep.setRestName(rest.getRestName());
		restRep.setPhoneNumber(rest.getPhoneNumber());
		restRep.setRestEmailId(rest.getRestEmailId());
		restRep.setRestWebsite(rest.getRestWebsite());
		restRep.setRestNosPetAllowed(rest.getRestNosPetAllowed());
		restRep.setRestPetWeightAllowed(rest.getRestPetWeightAllowed());
		restRep.setRestFeesSruct(rest.getRestFeesSruct());
		restRep.setAddress1(rest.getAddress1());
		restRep.setCity(rest.getCity());
		restRep.setState(rest.getState());
		restRep.setZipCode(rest.getZipCode());
		
		return restRep;
		
	}
}
