package com.agiraud.charon.core.dto;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
public class UserDetail implements UserDetails {
	private static final long serialVersionUID = 12112526L;

	/* ************************************************************************* */
	// ATTRIBUTES
	/* ************************************************************************* */
	
	private String username;
	private UUID userId;
	private String emailAddress;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	private String fullName;
	private boolean enabled;
	private String phoneNumber;
	private String profileImage;
	private List<String> roles;

	/* ************************************************************************* */
	// OVERRIDE
	/* ************************************************************************* */
	
	@Override
	public List<GrantedAuthority> getAuthorities() {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role)).collect(Collectors.toList());
	}

	@Override
	public boolean isAccountNonExpired() {
		return this.enabled;
	}

	@Override
	public boolean isAccountNonLocked() {
		return this.enabled;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return this.enabled;
	}

	@Override
	public boolean isEnabled() {
		return this.enabled;
	}

}
