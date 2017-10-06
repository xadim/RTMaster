/*package com.roamingtails.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.util.StringUtils;

public class CustomFilter extends AbstractAuthenticationProcessingFilter {


    public CustomFilter(RequestMatcher requestMatcher) {
        super(requestMatcher);

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, final FilterChain chain) throws IOException, ServletException {
        //This filter only applies if the header is present
        if(StringUtils.isEmpty(((HttpServletRequest)req).getHeader("Authorization"))) {
            chain.doFilter(req, res);
            return;
        }

        //On success keep going on the chain
        this.setAuthenticationSuccessHandler(new AuthenticationSuccessHandler() {
            @Override
        	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
                chain.doFilter(request, response);
            }
        });

        super.doFilter(req, res, chain);

    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException, IOException, ServletException {

        String tokenValue = request.getHeader("Authorization");

        if(StringUtils.isEmpty(tokenValue)) {            
           return null;
        }
        
        CustomToken token = new CustomToken(null);
        token.setValue(tokenValue);
        token.setDetails(authenticationDetailsSource.buildDetails(request));
        return this.getAuthenticationManager().authenticate(token);
    }

	

}*/