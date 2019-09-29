package com.agiraud.charon.core.exception;

public class InvalidEmailFormatException extends SystemException {

	/**
	 * The serial version id
	 */
	private static final long serialVersionUID = -1223704093843950795L;

	/**
	 * <p>
	 * This is the constructor of <code>InvalidEmailFormatException</code> class
	 * with message and cause arguments.
	 * </p>
	 *
	 * @param message   the error message.
	 * @param exception the cause of the exception.
	 */
	public InvalidEmailFormatException(String message, Throwable exception) {
		super(message, exception);

	}

	/**
	 * <p>
	 * This is the constructor of <code>InvalidEmailFormatException</code> class
	 * with message and cause arguments.
	 * </p>
	 *
	 * @param message the error message.
	 */
	public InvalidEmailFormatException(String message) {
		super(message);

	}

}
