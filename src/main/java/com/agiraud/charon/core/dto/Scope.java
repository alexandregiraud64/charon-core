package com.agiraud.charon.core.dto;

import java.util.LinkedList;
import java.util.List;

import org.springframework.security.oauth2.common.util.OAuth2Utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Scope {
	private String name;
	private String description;
	private String prefix = OAuth2Utils.SCOPE_PREFIX;
	private boolean isEnabled;
	private List<String> fields = new LinkedList<String>();
	private boolean isApproved; /* Extra data only used for the authorize page */
}
