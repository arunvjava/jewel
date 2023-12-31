package org.pras.user.exception;

/**
 * 
 * Custom exception class for application failure
 * 
 * @author avenkatesa21
 *
 */
public class ApplicationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1268845663560225296L;

	public ApplicationException(String message) {
		super(message);
	}

}
