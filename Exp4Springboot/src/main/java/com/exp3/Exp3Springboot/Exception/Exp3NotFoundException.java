package com.exp3.Exp3Springboot.Exception;

@SuppressWarnings("serial")
public class Exp3NotFoundException extends RuntimeException{
	

	public Exp3NotFoundException(String message)
	{
		super(message);
	}
	
	public Exp3NotFoundException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
