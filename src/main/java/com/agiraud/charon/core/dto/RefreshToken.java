package com.agiraud.charon.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.ByteBuffer;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefreshToken {
	private String tokenId;
	private ByteBuffer token;
	private ByteBuffer authentication;
}
