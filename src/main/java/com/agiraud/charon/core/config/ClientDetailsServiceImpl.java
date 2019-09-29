package com.agiraud.charon.core.config;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

import com.agiraud.charon.core.dao.ClientService;
import com.agiraud.charon.core.dto.ClientDetail;

@Service("clientDetailsServiceImpl")
@Slf4j
public class ClientDetailsServiceImpl implements ClientDetailsService {
	/* ************************************************************************* */
	// ATTRIBUTES
	/* ************************************************************************* */
	@Autowired
	private ClientService clientService;

	/* ************************************************************************* */
	// OVERRIDE
	/* ************************************************************************* */
	@Override
	public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
		log.debug("Loading client based on the ID: "+clientId);
		ClientDetail cassandraClientDetails = clientService.getClientDetailById(clientId);
		if(cassandraClientDetails == null) {
			throw new ClientRegistrationException("No client found for the ID: "+clientId);
		}
		return cassandraClientDetails;
	}
}
