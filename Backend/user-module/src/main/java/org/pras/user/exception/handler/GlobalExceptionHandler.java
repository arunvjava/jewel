package org.pras.user.exception.handler;

import org.pras.user.exception.ApplicationException;
import org.pras.user.utils.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 
 * Common class to handle all the exception occurred
 * 
 * @author avenkatesa21
 *
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ApplicationException.class)
	public ResponseEntity<Response<String>> handleApplicationException(ApplicationException appException) {
		Response<String> response = Response.<String>builder().message(appException.getMessage()).statusCode(500)
				.build();
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
