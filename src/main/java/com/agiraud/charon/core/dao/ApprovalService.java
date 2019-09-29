package com.agiraud.charon.core.dao;

import java.util.Collection;

import org.springframework.security.oauth2.provider.approval.Approval;

public interface ApprovalService {
	void create(final Approval approval);

	void delete(final Approval approval);

	void delete(Collection<Approval> approvals);

	Collection<Approval> getByUserId(final String userId);

	Collection<Approval> getByClientIdAndUserId(String clientId, String userId);
}
