package com.agiraud.charon.core.dao;

import java.util.List;

import com.agiraud.charon.core.dto.AccessToken;
import com.agiraud.charon.core.exception.EntityNotFoundException;

public interface AccessTokenService {
	void create(final AccessToken accessToken);

	void delete(final AccessToken accessToken);

	AccessToken getByTokenId(final String id);

	AccessToken getByAuthenticationId(final String id);

	AccessToken getByRefreshToken(final String refreshToken);

	List<AccessToken> getByClientId(final String id);

	List<AccessToken> getByClientIdAndUsername(final String id, String username);

	AccessToken findByTokenId(String id) throws EntityNotFoundException;

	AccessToken findByAuthenticationId(String id) throws EntityNotFoundException;

	AccessToken findByRefreshToken(String id) throws EntityNotFoundException;
}
