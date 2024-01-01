package org.pras.user.exception;

/**
 * 
 * Exception class for User not found scenario
 * 
 * @author avenkatesa21
 *
 */
public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9059025729169972574L;

	public UserNotFoundException(String errorMessage) {
		super(errorMessage);
	}

}
