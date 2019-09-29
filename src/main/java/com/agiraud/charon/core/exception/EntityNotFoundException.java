package com.agiraud.charon.core.exception;

public class EntityNotFoundException extends SystemException {

	/**
	 * The serial version id.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <p>
	 * This is the constructor of <code>EntityNotFoundException</code> class with
	 * message argument.
	 * </p>
	 *
	 * @param message the error message.
	 */
	public EntityNotFoundException(String message) {
		super(message);
	}

	/**
	 * <p>
	 * This is the constructor of <code>EntityNotFoundException</code> class with
	 * message and cause arguments.
	 * </p>
	 *
	 * @param message the error message.
	 * @param cause   the cause of the exception.
	 */
	public EntityNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
