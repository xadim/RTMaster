/*package com.roamingtails.security;

import java.util.Collection;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class CustomToken extends AbstractAuthenticationToken {
	
	public CustomToken(Collection<? extends GrantedAuthority> authorities) {
		super(authorities);
		// TODO Auto-generated constructor stub
	}

	private  String value;

	public void setValue(String value) {
		this.value = value;
	}

		@Override
	public void setAuthenticated(boolean isAuthenticated) {
	    if (isAuthenticated) {
	        throw new IllegalArgumentException("Not authenticated");
	    }
	    super.setAuthenticated(true);
	}

	@Override
	public Object getCredentials() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getValue() {
		return value;
	}

	
}
*/