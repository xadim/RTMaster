package com.roamingtails.security;

import java.nio.charset.Charset;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
 
@Component
public class RestTemplateFactory implements FactoryBean<RestTemplate>, InitializingBean {
    private RestTemplate restTemplate;
 
    public RestTemplate getObject() {
        return restTemplate;
    }
    public Class<RestTemplate> getObjectType() {
        return RestTemplate.class;
    }
    public boolean isSingleton() {
        return true;
    }
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public String createHeaders( String username, String password ){
	{
		 
		 String auth = username + ":" + password;
		 byte[] encodedAuth = Base64.encode(auth.getBytes(Charset.forName("US-ASCII")) );
		 String authHeader = "Basic " + new String( encodedAuth );
		 return authHeader;
		      
	}
		
	}
}
