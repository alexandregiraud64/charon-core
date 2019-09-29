package com.agiraud.charon.core.dao;

import java.util.Collection;
import java.util.UUID;

import com.agiraud.charon.core.dto.User;
import com.agiraud.charon.core.dto.UserDetail;
import com.agiraud.charon.core.exception.EntityNotFoundException;

public interface UserService {
	void create(final User user, boolean forced);

	void delete(final User user);

	void update(final User userBefore, final User userAfter);

	User getByUsername(final String username);

	User getByEmail(final String email);

	User getByUserId(final UUID userId);

	Collection<User> getAll();

	UserDetail getUserDetailByUsername(final String username);

	UserDetail getUserDetailByEmail(final String email);

	User findByUsername(final String username) throws EntityNotFoundException;

	User findByEmailAddress(final String email) throws EntityNotFoundException;

	User findByUserId(final UUID userId) throws EntityNotFoundException;

	void deleteById(final UUID userId) throws EntityNotFoundException;

	void updateToAdmin(final UUID userId) throws EntityNotFoundException;
}
