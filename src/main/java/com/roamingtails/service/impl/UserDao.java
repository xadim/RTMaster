package com.roamingtails.service.impl;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.roamingtails.model.UserProfile;

@RepositoryRestResource(collectionResourceRel = "RoamingTails", path = "Userprofile")
public interface UserDao extends MongoRepository<UserProfile,String> {

	public UserProfile findByemailId(String userId);

}
