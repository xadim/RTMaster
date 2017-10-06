package com.roamingtails.service;

import com.roamingtails.model.Restaurants;
import java.util.List;


public interface IRestaurantService {
	public Restaurants findOne(String restId);

	List<Restaurants> findByzipCodeIn(int zipCode);

	//List<Restaurants> findByRestaurantName(String name);

	public List<Restaurants> findAll();
}
