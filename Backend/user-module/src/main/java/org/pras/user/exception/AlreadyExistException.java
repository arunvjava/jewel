package org.pras.user.exception;

public class AlreadyExistException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3444319675129815551L;

	public AlreadyExistException(String errorMessage) {
		super(errorMessage);
	}

}
