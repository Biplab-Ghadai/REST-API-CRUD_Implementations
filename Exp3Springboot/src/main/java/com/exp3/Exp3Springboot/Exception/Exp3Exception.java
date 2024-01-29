package com.exp3.Exp3Springboot.Exception;

import org.springframework.http.HttpStatus;

public class Exp3Exception {
	
	private final String message;
	private final Throwable throwable;
	private final HttpStatus httpStatus;
	
	
	public Exp3Exception(String message, Throwable throwable, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
	}


	public String getMessage() {
		return message;
	}


	public Throwable getThrowable() {
		return throwable;
	}


	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	
	
	
	
}
