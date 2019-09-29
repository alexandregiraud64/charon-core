package com.agiraud.charon.core.dao;

import com.agiraud.charon.core.dto.UserDetail;
import com.agiraud.charon.core.exception.NotRegisteredException;

public interface SessionService {
	Object getPrincipal();

	Boolean isAuthenticate();

	UserDetail getPrincipalAsCustomUserPrincipal();

	UserDetail getAuthenticatedUser() throws NotRegisteredException;

	String getAuthenticatedUserLogin();
}
