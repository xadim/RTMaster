package com.roamingtails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roamingtails.model.Restaurants;
import com.roamingtails.service.IRestaurantService;
import java.util.List;

@Service
public class RestaurantServiceImpl implements IRestaurantService{

	@Autowired
	RestaurantDao restDao;

	

	@Override
	public Restaurants findOne(String restId) {
		// TODO Auto-generated method stub
		return restDao.findOne(restId);
	}

	@Override
	public List<Restaurants> findByzipCodeIn(int zipCode) {
		// TODO Auto-generated method stub
		return restDao.findByzipCode(zipCode);
	}

	@Override
	public List<Restaurants> findAll() {
		// TODO Auto-generated method stub
		return restDao.findAll();
	}

	
	/*@Override
	public Restaurants findOne(String zipCode) {
		return restDao.findOne(zipCode);
	}*/
	
}
