package com.agiraud.charon.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.ByteBuffer;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccessToken {
	private String tokenId;
	private ByteBuffer token;
	private String authenticationId;
	private String username;
	private String clientId;
	private ByteBuffer authentication;
	private String refreshToken;
}
