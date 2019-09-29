package com.agiraud.charon.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
	private String clientId;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String clientSecret;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String clientSecretConfirm; /* Used only to confirm the form after being submitted */
	private String displayName;
	private Set<String> scope = new HashSet<String>();
	private Set<String> resourceIds = new HashSet<String>();
	private Set<String> authorizedGrantTypes = new HashSet<String>();
	private Set<String> registeredRedirectUri = new HashSet<String>();
	private Set<String> authorities = new HashSet<String>();
	private Integer accessTokenValiditySeconds = 21600;
	private Integer refreshTokenValiditySeconds = 2592000;
	private String additionalInformation;
	private Set<String> autoApproveScopes = new HashSet<String>();
	private UUID userId;
}
