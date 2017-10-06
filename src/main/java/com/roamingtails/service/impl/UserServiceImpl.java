package com.roamingtails.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.roamingtails.model.UserProfile;
import com.roamingtails.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	UserDao userDao;
	
	@Override
	public void save(UserProfile profile) {
		userDao.save(profile);		
	}
	
	@Override
	public List<UserProfile> findAll()
	{
		return userDao.findAll();		
	}
	@Override
	public UserProfile findOne(String userId)
	{
		return userDao.findOne(userId);
	}
	/*@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException
	{
		UserProfile user = userDao.findByUserId(userId);
		   //throw new UsernameNotFoundException( "User not found!" );
		  /* if(user == null){
	            throw new UsernameNotFoundException(userId);
	        }else{
	            UserDetails details = new UserProfile(user);
	            return details;
		    
		return user;
	}
*/

	
	
}
