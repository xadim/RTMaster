package com.roamingtails.service;
import java.util.List;



import com.roamingtails.model.UserProfile;

public interface IUserService{

	public void save(UserProfile profile);

	public List<UserProfile> findAll();

	public UserProfile findOne(String userId);
	//public UserProfile findByUserId(String userId);
}
