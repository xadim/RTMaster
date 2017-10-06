package com.roamingtails;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roamingtails.mapper.UserProfileMapper;
import com.roamingtails.model.PetProfile;
import com.roamingtails.model.UserProfile;
import com.roamingtails.model.request.PetProfileRequest;
import com.roamingtails.service.IUserService;

@RestController
@RequestMapping("/petprofile")
public class PetProfileController {

	@Autowired
	IUserService userService;
	
	@RequestMapping(method = RequestMethod.PUT, value="/{userId}")
	  public UserProfile addPetDetails(@PathVariable("userId") String userId, @RequestBody PetProfileRequest request) throws IOException{				 
		UserProfile petDetails = userService.findOne(userId);
		UserProfileMapper mapper = new UserProfileMapper();
		PetProfile petProfile = mapper.mapPetProfile(request);	
		petDetails.getPetList().add(petProfile);
		userService.save(petDetails);	
		return petDetails;
	  }
}
