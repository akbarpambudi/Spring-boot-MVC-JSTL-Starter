package com.kikicr.myapp.http.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	  public void configure(HttpSecurity http) throws Exception {
		  http.csrf().disable()
		  
        .authorizeRequests()
        		
               .antMatchers("/node_modules/**","/source/**","/").permitAll();
               
	  }
}