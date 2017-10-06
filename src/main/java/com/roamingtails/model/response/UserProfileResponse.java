package com.roamingtails.model.response;

import com.roamingtails.model.request.UserProfileRequest;

public class UserProfileResponse {

	private String statusCode;
	private String userId;
	private UserProfileRequest request;
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
	
	public UserProfileResponse() {
		//userId="1";
		statusCode="SUCCESS";
	}
	
	public UserProfileRequest getRequest() {
		return request;
	}
	public void setRequest(UserProfileRequest request) {
		this.request = request;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
