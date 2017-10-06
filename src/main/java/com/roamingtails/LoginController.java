/*package com.roamingtails;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roamingtails.model.UserProfile;
import com.roamingtails.model.request.UserProfileRequest;
import com.roamingtails.model.response.UserProfileResponse;
import com.roamingtails.service.UserService;

@RestController
//@RequestMapping("/login")
public class LoginController {
	
	private RequestCache requestCache = new HttpSessionRequestCache();
	
	 @RequestMapping("/authenticate")
	    public String authenticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        boolean authenticate = request.authenticate(response);
	        return authenticate ? "index" : null;
	}
	 
	 @RequestMapping(value = "/login", method = RequestMethod.POST)
	    public String login(HttpServletRequest request, HttpServletResponse response, @RequestBody UserProfileRequest userProfile,
	                        BindingResult result) throws ServletException {
	        try {
	            request.login(userProfile.getEmailId(), userProfile.getPassword());
	            SavedRequest savedRequest = requestCache.getRequest(request, response);
	            if (savedRequest != null) {
	                return "redirect:" + savedRequest.getRedirectUrl();
	            } else {
	                return "redirect:/";
	            }

	        } catch (ServletException authenticationFailed) {
	            result.rejectValue(null, "authentication.failed");
	            return "login";
	        }
	}
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping(method = RequestMethod.GET, value="/{userId},{password}")
	public UserProfileResponse loginUserProfile(@PathVariable("userId") String userId){
		
	//	UserProfileMapper mapper = new UserProfileMapper();
	//	UserProfile profile = mapper.mapUserProfileRequest(request);
		userService.findOne(userId);	
	//	UserProfileResponse response = new UserProfileResponse();
	//	response.setRequest(request);
		return new UserProfileResponse();
	}

}
*/