package com.agiraud.charon.core.dto;

import java.nio.ByteBuffer;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorizationCode {
	private String code;
	private String clientId;
	private ByteBuffer authentication;
	private Date expiresAt;
}
