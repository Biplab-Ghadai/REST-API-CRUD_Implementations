package com.exp3.Exp3Springboot.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exp3ExceptionHandler {
	
	@ExceptionHandler(value = {Exp3NotFoundException.class})
	public ResponseEntity<Object> handleExp3NotFoundException(Exp3NotFoundException exp3NotFoundException)
	{
		Exp3Exception exp3Exception = new Exp3Exception(
				
				exp3NotFoundException.getMessage(),
				exp3NotFoundException.getCause(),
				HttpStatus.NOT_FOUND
		);
	return new ResponseEntity<>(exp3Exception, HttpStatus.NOT_FOUND);	
	}
}
