package com.agiraud.charon.core.config;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.agiraud.charon.core.dao.UserService;
import com.agiraud.charon.core.dto.UserDetail;

@Service("userDetailsServiceImpl")
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {
	/* ************************************************************************* */
	// ATTRIBUTES
	/* ************************************************************************* */
	@Autowired
	private UserService userService;

	/* ************************************************************************* */
	// OVERRIDE
	/* ************************************************************************* */
	@Override
	public UserDetails loadUserByUsername(String username) {
		log.debug("loadUserByUsername for user: " + username);
		UserDetail userDetailByUserName = userService.getUserDetailByUsername(username);
		return userDetailByUserName;
	}

	/* ************************************************************************* */
	// BEANS
	/* ************************************************************************* */
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
