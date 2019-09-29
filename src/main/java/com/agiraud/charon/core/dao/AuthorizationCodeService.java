package com.agiraud.charon.core.dao;

import com.agiraud.charon.core.dto.AuthorizationCode;
import com.agiraud.charon.core.exception.EntityNotFoundException;

public interface AuthorizationCodeService {
	void create(final AuthorizationCode authenticationCode);

	void delete(final AuthorizationCode authenticationCode);

	AuthorizationCode getByCode(final String code);

	AuthorizationCode deleteByCode(final String code);
	
	AuthorizationCode findByCode(String code) throws EntityNotFoundException;
}
