package com.agiraud.charon.core.dao;

import java.util.Collection;

import com.agiraud.charon.core.dto.Client;
import com.agiraud.charon.core.dto.ClientDetail;
import com.agiraud.charon.core.exception.EntityNotFoundException;

public interface ClientService {
	void create(final Client client);

	void delete(final Client client);

	Client getById(final String clientId);

	Collection<Client> getAllClientsForAuthenticatedUser();

	ClientDetail getClientDetailById(final String clientId);
	
	Client findByClientId(String id) throws EntityNotFoundException;

	void deleteById(final String clientId);
}
