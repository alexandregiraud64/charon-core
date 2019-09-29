package com.agiraud.charon.core.exception;

public class NotRegisteredException extends SystemException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2000538016809920559L;

	/**
	 * <p>
	 * This is the constructor of <code>NotRegisteredException</code> class with
	 * message and cause arguments.
	 * </p>
	 *
	 * @param message   the error message.
	 * @param exception the cause of the exception.
	 */
	public NotRegisteredException(String message, Throwable exception) {
		super(message, exception);

	}

	/**
	 * <p>
	 * This is the constructor of <code>NotRegisteredException</code> class with
	 * exception and cause arguments.
	 * </p>
	 *
	 * @param exception the error exception.
	 */
	public NotRegisteredException(String exception) {
		super(exception);
	}

}
