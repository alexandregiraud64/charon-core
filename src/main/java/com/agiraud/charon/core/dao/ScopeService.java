package com.agiraud.charon.core.dao;

import java.util.Collection;

import com.agiraud.charon.core.dto.Scope;
import com.agiraud.charon.core.exception.EntityNotFoundException;

public interface ScopeService {
	void create(final Scope scope);

	void delete(final Scope scope);

	Scope getByName(final String name);

	Collection<Scope> getAll();

	Scope findByScopeName(String name) throws EntityNotFoundException;
}
