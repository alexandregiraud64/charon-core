package com.agiraud.charon.core.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String username;
	private UUID userId;
	private String emailAddress;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String passwordConfirm; /* Used only to confirm the form after being submitted */
	private String fullName;
	private boolean enabled;
	private String phoneNumber;
	private String profileImage;
	private List<String> roles = new ArrayList<>();
}
