package com.agiraud.charon.core.exception;

public class InvalidDataException extends SystemException {

	private static final long serialVersionUID = -3176392501022469536L;

	/**
	 * <p>
	 * This is the constructor of <code>InvalidDataException</code> class with
	 * message and cause arguments.
	 * </p>
	 *
	 * @param message   the error message.
	 * @param exception the cause of the exception.
	 */
	public InvalidDataException(String message, Throwable exception) {
		super(message, exception);

	}

	/**
	 * <p>
	 * This is the constructor of <code>InvalidDataException</code> class with
	 * message and cause arguments.
	 * </p>
	 *
	 * @param message the error message.
	 */
	public InvalidDataException(String message) {
		super(message);

	}

}
