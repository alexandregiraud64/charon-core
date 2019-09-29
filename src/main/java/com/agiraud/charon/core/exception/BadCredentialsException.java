package com.agiraud.charon.core.exception;

import org.springframework.security.core.AuthenticationException;

public class BadCredentialsException extends AuthenticationException {

	private static final long serialVersionUID = 668083466551901028L;

	/**
	 * <p>
	 * This is the constructor of <code>AuthenticationException</code> class with
	 * message and cause arguments.
	 * </p>
	 *
	 * @param exception the error message.
	 */
	public BadCredentialsException(String exception) {
		super(exception);
	}

	/**
	 * <p>
	 * This is the constructor of <code>AuthenticationException</code> class with
	 * message and cause arguments.
	 * </p>
	 *
	 * @param message the error message.
	 * @param cause   the cause of the exception.
	 */
	public BadCredentialsException(String message, Throwable cause) {
		super(message, cause);
	}
}
