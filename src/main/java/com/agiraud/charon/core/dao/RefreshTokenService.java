package com.agiraud.charon.core.dao;

import com.agiraud.charon.core.dto.RefreshToken;
import com.agiraud.charon.core.exception.EntityNotFoundException;

public interface RefreshTokenService {
	void create(final RefreshToken refreshToken);

	void delete(final RefreshToken refreshToken);

	RefreshToken getById(final String id);
	
	RefreshToken findByTokenId(String id) throws EntityNotFoundException;
}
