package com.agiraud.charon.core.dto;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDetail implements ClientDetails {
	private static final long serialVersionUID = 200405950839986386L;

	/* ************************************************************************* */
	// ATTRIBUTES
	/* ************************************************************************* */
	
	protected String clientId;
	@JsonProperty(access = Access.WRITE_ONLY)
	protected String clientSecret;
	protected String displayName;
	protected Set<String> scope = new HashSet<String>();
	protected Set<String> resourceIds = new HashSet<String>();
	protected Set<String> authorizedGrantTypes = new HashSet<String>();
	protected Set<String> registeredRedirectUri = new HashSet<String>();
	protected List<GrantedAuthority> authorities = new LinkedList<GrantedAuthority>();
	protected Integer accessTokenValiditySeconds = 2592000;
	protected Integer refreshTokenValiditySeconds = 2592000 * 30;
	protected Map<String, Object> additionalInformation = new LinkedHashMap<String, Object>();
	protected Set<String> autoApproveScopes;

	/* ************************************************************************* */
	// OVERRIDE
	/* ************************************************************************* */
	
	@Override
	public boolean isSecretRequired() {
		return true;
	}

	@Override
	public boolean isScoped() {
		return true;
	}

	@Override
	public boolean isAutoApprove(String scope) {
		return false;
	}


}
