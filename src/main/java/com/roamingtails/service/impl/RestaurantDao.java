package com.roamingtails.service.impl;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.roamingtails.model.Restaurants;

@RepositoryRestResource(collectionResourceRel = "RoamingTails", path = "Restaurants")
public interface RestaurantDao extends MongoRepository<Restaurants,String> {

	List<Restaurants> findByzipCode(int zipCode);

}
