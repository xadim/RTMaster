package com.roamingtails.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;



@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {	
	/*
	protected AbstractAuthenticationProcessingFilter createCustomFilter() throws Exception {
		CustomFilter filter = new CustomFilter ( new RegexRequestMatcher("^/.*", null));
        filter.setAuthenticationManager(this.authenticationManagerBean());
        return filter;
      }*/
	
    @Override
	protected void configure(HttpSecurity http) throws Exception {
    	http
       
      .csrf().disable()
      .authorizeRequests()
        .antMatchers(HttpMethod.PUT, "/user/**").authenticated()
        .antMatchers(HttpMethod.GET, "/user/**").authenticated()
        .antMatchers(HttpMethod.GET, "/restaurant/**").authenticated()  
        .antMatchers(HttpMethod.POST, "/user/create").anonymous()
        .anyRequest().permitAll()
        .and()
      .httpBasic().and()
      .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
  }
  
}
