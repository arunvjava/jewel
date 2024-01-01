package org.pras.user.utils;

import lombok.Builder;
import lombok.Getter;

/**
 * Generic format class to hold the response structure
 *
 * @param <T> which holds the actual response values
 * 
 * @author avenkatesa21
 * 
 */

@Getter
@Builder
public class Response<T> {

	private int statusCode;
	private String message;
	private T responseObj;

}
