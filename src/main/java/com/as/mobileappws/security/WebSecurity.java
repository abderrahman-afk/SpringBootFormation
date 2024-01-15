package com.as.mobileappws.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class WebSecurity   {
	private final UserDetailsService userDetailsService;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	  
	public WebSecurity(UserDetailsService userDetailsService, BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.userDetailsService = userDetailsService;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	 @Bean
	    public SecurityFilterChain  securityfilterChain(HttpSecurity http) throws Exception {
         http.csrf(csrf -> csrf.disable())
                 .authorizeHttpRequests((authz) -> authz
                                 .requestMatchers(HttpMethod.POST,"/users").permitAll()
                                 .anyRequest().authenticated()
                 )
                 .httpBasic(withDefaults());
	        return http.build();
	    }
	
	
 
}
