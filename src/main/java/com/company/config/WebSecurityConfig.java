package com.company.config;

import com.company.security.JwtAuthenticationEntryPoint;
import com.company.services.UserDetailsServiceImpl;

public class WebSecurityConfig  extends SecurityConfig{
    public WebSecurityConfig(UserDetailsServiceImpl userDetailsService, JwtAuthenticationEntryPoint handler) {
        super(userDetailsService, handler);
    }
}
