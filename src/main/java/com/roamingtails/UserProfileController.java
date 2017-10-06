package com.roamingtails;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.roamingtails.mapper.UserProfileMapper;
import com.roamingtails.model.UserProfile;
import com.roamingtails.model.request.UserProfileRequest;
import com.roamingtails.model.response.UserProfileResponse;
import com.roamingtails.security.RestTemplateFactory;
import com.roamingtails.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserProfileController {
	@Autowired
	IUserService userService;
	
	//@Secured({"USER"})
	@RequestMapping(method=RequestMethod.POST,path="/create")
	public UserProfileResponse createUserProfile(@RequestBody UserProfileRequest request) throws IOException{
		RestTemplateFactory rst = new RestTemplateFactory();
		String header = rst.createHeaders(request.getEmailId(), request.getPassword());
		UserProfileMapper mapper = new UserProfileMapper();
		UserProfile profile = mapper.mapUserProfileRequest(request);
		userService.save(profile);	
		UserProfileResponse response = new UserProfileResponse();
		response.setRequest(request);
		response.setUserId(profile.getUserId());
		response.setStatusCode(header);
		return response;
	}
	
	@RequestMapping(method = RequestMethod.GET, path="/findAll")
	  public List<UserProfile> getUserDetails(){				 
		return userService.findAll();
	  }
	
	@RequestMapping(method = RequestMethod.GET, value="/{userId}")
	  public UserProfile getUserSpecificDetails(@PathVariable("userId") String userId){				 
		return userService.findOne(userId);
	  }
	
	@RequestMapping(method = RequestMethod.PUT, value="/{userId}")
	  public UserProfile editUser(@PathVariable("userId") String userId,@RequestBody UserProfileRequest request) throws IOException
	  {
		UserProfile profile = userService.findOne(userId);
		UserProfileMapper mapper = new UserProfileMapper();
		UserProfile updatedProfile = mapper.mapUserProfileRequest(request);	
		if(!profile.equals(updatedProfile))
		{
			try {
				profile = mapper.updateProfile(profile,updatedProfile);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			userService.save(profile);
		}				
		return profile;
	  }
	
	
	
	/*@RequestMapping(method = RequestMethod.GET,path="/login/{userId}")
	public UserDetails loginUser(@PathVariable("userId") String username){				 
		// UserDetails u = userService.loadUserByUsername(username);
		 if(u != null)
		 return u;
		 else return null;
	  }*/
}
